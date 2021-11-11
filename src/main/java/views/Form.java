/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import elements.Canvas;
import elements.Funcs;
import java.io.File;

/**
 *
 * @author thiago
 */
public class Form extends javax.swing.JFrame {
    private Canvas canvas;
    private final File[] entities = Funcs.loadPath("assets/entities");
    private File entity;
    private final File[] tiles = Funcs.loadPath("assets/tiles");
    private File tile;
    
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        
        for (File e : entities) {
            cbEntitySprites.addItem(e.getName());
        }
        
        for (File t : tiles) {
            cbTileSprites.addItem(t.getName());
        }
        
        entitySpriteList.setCellRenderer(new ImageListRenderer());
        tileSpriteList.setCellRenderer(new ImageListRenderer());
        
        canvas = new Canvas();
        canvasArea.add(canvas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanel = new javax.swing.JTabbedPane();
        tabMap = new javax.swing.JPanel();
        lbWidth = new javax.swing.JLabel();
        tfWidth = new javax.swing.JTextField();
        lbHeight = new javax.swing.JLabel();
        tfHight = new javax.swing.JTextField();
        btCriar = new javax.swing.JButton();
        btIniciar = new javax.swing.JButton();
        btParar = new javax.swing.JButton();
        tabEntidades = new javax.swing.JPanel();
        entitySpritesProps = new javax.swing.JTabbedPane();
        entitySprites = new javax.swing.JPanel();
        cbEntitySprites = new javax.swing.JComboBox<>();
        entitySpriteScroll = new javax.swing.JScrollPane();
        entitySpriteList = new javax.swing.JList<>();
        entityProps = new javax.swing.JPanel();
        tabTiles = new javax.swing.JPanel();
        tilesSpritesProps = new javax.swing.JTabbedPane();
        tileSprites = new javax.swing.JPanel();
        cbTileSprites = new javax.swing.JComboBox<>();
        tileSpriteScroll = new javax.swing.JScrollPane();
        tileSpriteList = new javax.swing.JList<>();
        tileProps = new javax.swing.JPanel();
        canvasArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form");
        setName("form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1324, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(1324, 640));

        tabMap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        lbWidth.setText("Largura:");

        tfWidth.setText("50");

        lbHeight.setText("Altura:");

        tfHight.setText("50");

        btCriar.setText("Criar");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        btIniciar.setText("Iniciar");
        btIniciar.setEnabled(false);
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        btParar.setText("Parar");
        btParar.setEnabled(false);
        btParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMapLayout = new javax.swing.GroupLayout(tabMap);
        tabMap.setLayout(tabMapLayout);
        tabMapLayout.setHorizontalGroup(
            tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHeight)
                    .addComponent(lbWidth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMapLayout.createSequentialGroup()
                        .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHight, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(tfWidth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tabMapLayout.createSequentialGroup()
                        .addComponent(btIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btParar)
                        .addGap(39, 39, 39))))
        );
        tabMapLayout.setVerticalGroup(
            tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMapLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabMapLayout.createSequentialGroup()
                        .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbWidth)
                            .addComponent(tfWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHeight)
                            .addComponent(tfHight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btParar)
                    .addComponent(btIniciar))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        tabPanel.addTab("Mapa", tabMap);

        tabEntidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        cbEntitySprites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntitySpritesActionPerformed(evt);
            }
        });

        entitySpriteScroll.setViewportView(entitySpriteList);

        javax.swing.GroupLayout entitySpritesLayout = new javax.swing.GroupLayout(entitySprites);
        entitySprites.setLayout(entitySpritesLayout);
        entitySpritesLayout.setHorizontalGroup(
            entitySpritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entitySpritesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbEntitySprites, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(entitySpritesLayout.createSequentialGroup()
                .addComponent(entitySpriteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        entitySpritesLayout.setVerticalGroup(
            entitySpritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entitySpritesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbEntitySprites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entitySpriteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        entitySpritesProps.addTab("Sprites", entitySprites);

        javax.swing.GroupLayout entityPropsLayout = new javax.swing.GroupLayout(entityProps);
        entityProps.setLayout(entityPropsLayout);
        entityPropsLayout.setHorizontalGroup(
            entityPropsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        entityPropsLayout.setVerticalGroup(
            entityPropsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        entitySpritesProps.addTab("Propriedades", entityProps);

        javax.swing.GroupLayout tabEntidadesLayout = new javax.swing.GroupLayout(tabEntidades);
        tabEntidades.setLayout(tabEntidadesLayout);
        tabEntidadesLayout.setHorizontalGroup(
            tabEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEntidadesLayout.createSequentialGroup()
                .addComponent(entitySpritesProps, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabEntidadesLayout.setVerticalGroup(
            tabEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entitySpritesProps, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPanel.addTab("Entidades", tabEntidades);

        tabTiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        cbTileSprites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTileSpritesActionPerformed(evt);
            }
        });

        tileSpriteScroll.setViewportView(tileSpriteList);

        javax.swing.GroupLayout tileSpritesLayout = new javax.swing.GroupLayout(tileSprites);
        tileSprites.setLayout(tileSpritesLayout);
        tileSpritesLayout.setHorizontalGroup(
            tileSpritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tileSpritesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTileSprites, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tileSpritesLayout.createSequentialGroup()
                .addComponent(tileSpriteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tileSpritesLayout.setVerticalGroup(
            tileSpritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tileSpritesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTileSprites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tileSpriteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tilesSpritesProps.addTab("Sprites", tileSprites);

        javax.swing.GroupLayout tilePropsLayout = new javax.swing.GroupLayout(tileProps);
        tileProps.setLayout(tilePropsLayout);
        tilePropsLayout.setHorizontalGroup(
            tilePropsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        tilePropsLayout.setVerticalGroup(
            tilePropsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        tilesSpritesProps.addTab("Propriedades", tileProps);

        javax.swing.GroupLayout tabTilesLayout = new javax.swing.GroupLayout(tabTiles);
        tabTiles.setLayout(tabTilesLayout);
        tabTilesLayout.setHorizontalGroup(
            tabTilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTilesLayout.createSequentialGroup()
                .addComponent(tilesSpritesProps, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabTilesLayout.setVerticalGroup(
            tabTilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTilesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tilesSpritesProps, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPanel.addTab("Tiles", tabTiles);

        canvasArea.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout canvasAreaLayout = new javax.swing.GroupLayout(canvasArea);
        canvasArea.setLayout(canvasAreaLayout);
        canvasAreaLayout.setHorizontalGroup(
            canvasAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        canvasAreaLayout.setVerticalGroup(
            canvasAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canvasArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        int width = Integer.parseInt(tfWidth.getText()) * 32;
        int height = Integer.parseInt(tfHight.getText()) * 32;
        
        canvas.createMap(width, height);
        canvas.start();
        btIniciar.setEnabled(false);
        btCriar.setEnabled(false);
        btParar.setEnabled(true);
    }//GEN-LAST:event_btCriarActionPerformed

    private void btPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPararActionPerformed
        canvas.stop();
        btIniciar.setEnabled(true);
        btCriar.setEnabled(false);
        btParar.setEnabled(false);
    }//GEN-LAST:event_btPararActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        canvas.start();
        btIniciar.setEnabled(false);
        btCriar.setEnabled(false);
        btParar.setEnabled(true);
    }//GEN-LAST:event_btIniciarActionPerformed

    private void cbEntitySpritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntitySpritesActionPerformed
        entity = entities[cbEntitySprites.getSelectedIndex()];
        entitySpriteList.setListData(entity.listFiles());
    }//GEN-LAST:event_cbEntitySpritesActionPerformed

    private void cbTileSpritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTileSpritesActionPerformed
        tile = tiles[cbTileSprites.getSelectedIndex()];
        tileSpriteList.setListData(tile.listFiles());
    }//GEN-LAST:event_cbTileSpritesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btParar;
    private javax.swing.JPanel canvasArea;
    private javax.swing.JComboBox<String> cbEntitySprites;
    private javax.swing.JComboBox<String> cbTileSprites;
    private javax.swing.JPanel entityProps;
    private javax.swing.JList<File> entitySpriteList;
    private javax.swing.JScrollPane entitySpriteScroll;
    private javax.swing.JPanel entitySprites;
    private javax.swing.JTabbedPane entitySpritesProps;
    private javax.swing.JLabel lbHeight;
    private javax.swing.JLabel lbWidth;
    private javax.swing.JPanel tabEntidades;
    private javax.swing.JPanel tabMap;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JPanel tabTiles;
    private javax.swing.JTextField tfHight;
    private javax.swing.JTextField tfWidth;
    private javax.swing.JPanel tileProps;
    private javax.swing.JList<File> tileSpriteList;
    private javax.swing.JScrollPane tileSpriteScroll;
    private javax.swing.JPanel tileSprites;
    private javax.swing.JTabbedPane tilesSpritesProps;
    // End of variables declaration//GEN-END:variables
}
