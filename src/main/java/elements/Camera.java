/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;
/**
 *
 * @author thiago
 */
public class Camera {
    public static int x = 0;
    public static int y = 0;
    
    private static int clamp(double current, double min, double max) {
        if (current < min) current = min;
        if (current > max) current = max;
        return (int)(current);
    }
    
    public static void update(double x, double y) {
        double curX = x - (Canvas.width - (Tile.size*2));///2);
        double maxX = Map.w_vts; // - Window.width;
        double curY = y - (Canvas.height - (Tile.size*2));///2);
        double maxY = Map.h_vts; // - Window.height;

        Camera.x = clamp(curX, 0, maxX);
        Camera.y = clamp(curY, 0, maxY);
    }
}
