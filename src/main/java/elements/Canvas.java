/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import json.JsonMap;

/**
 *
 * @author thiago
 */
public class Canvas extends java.awt.Canvas implements Runnable{
    public static final int width = 32*34;
    public static final int height = 32*19;
    private boolean isRunning = false;
    private Thread thread;
    private final Image image;
    private Map map;
    private BufferStrategy bs;
    private Keyboard keyboard;
    private Mouse mouse;
    
    public Canvas() {
        createBufferStrategy(1);
        setSize(width, height);
        setBackground(Color.BLACK);
        
        bs = getBufferStrategy();
        mouse = new Mouse();
        keyboard = new Keyboard();
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        addMouseListener(mouse);
        addKeyListener(keyboard);
    }
    
    public synchronized void start() {
        if(!isRunning) {
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }        
    }
    
    public void createMap(int w, int h) {
        map = new Map(w, h);
    }
    
    public JsonMap getJSON() {
        return new JsonMap(
            map.width, 
            map.height,
            map.w_vts,
            map.h_vts
        );
    }
    
    public synchronized void stop() {
        if (isRunning) {
            isRunning = false;
            thread.interrupt();
        }        
    }
    
    public void tick() {
        // Lógica do jogo aqui.
        World.tick();
        Inventory.tick();
        Cursor.tick();
    }
    
    public void render() {        
        // Desenhando os elementos na imagem principal.
        Graphics g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        
        // Renderizar os elementos do jogo aqui!
        World.render(g);
        Cursor.render(g);
        
        g.dispose();

        // Desenhando a imagem principal na tela.
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, width, height, null);
        bs.show();
    }
    
    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 20;//60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        double timer = System.currentTimeMillis();

        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            
            if (delta >= 1) {
                tick();
                render();
                delta--;
            }

            if (System.currentTimeMillis() - timer >= 1000) {
                timer += 1000;
            }
        }
    }
}
