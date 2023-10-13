/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Yiro
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private final List<Integer> caminoX = new ArrayList<Integer>();
    private final List<Integer> caminoY = new ArrayList<Integer>();
    ArrayList<Nodo> listaNodos = new ArrayList<>();
    int[][] mapa =
    {
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1},
    {1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1},
    {1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1},
    {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,1},
    {1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1},
    {1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1},
    {1,0,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1},
    {1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
    {1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1},
    {1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    {1,0,1,1,1,1,0,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,0,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1},
    {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1},
    {1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    {1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,0,1,1},
    {1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
    {1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,1},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
    @Override
        public void paint(Graphics g){ 
            Graphics2D g2d = (Graphics2D)jPanel1.getGraphics();
            for (int row = 0; row < mapa.length; row++) {
                for (int col = 0; col < mapa[0].length; col++){
                    Color color;
                    switch (mapa[row][col]){
                        case 1:
                            color = Color.BLACK; 
                            break;
                        case 9:
                            color = Color.red; 
                            break;
                        case 7:
                            color = Color.blue;
                            break;
                        default:
                            color = Color.white;
                    }
                    g2d.setColor(color);
                    g2d.fillRect(20 * col, 20 * row, 20, 20);
                    g2d.setColor(Color.gray);
                    g2d.drawRect(20 * col, 20 * row, 20, 20);
                }
            }
        }
        
        public boolean BusquedaAnchura(int[][] mapa, int x, int y, List<Integer> caminoX, List<Integer> caminoY) {
            int rows = mapa.length;
            int cols = mapa[0].length;

            if (x < 0 || x >= rows || y < 0 || y >= cols || mapa[x][y] != 0) {
                return false; 
            }

            Queue<Nodo> queue = new LinkedList<>();
            queue.add(new Nodo(x, y, null));
            listaNodos.add(new Nodo(x,y,null));
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

            while (!queue.isEmpty()) {
                Nodo current = queue.poll();
                int currentX = current.getX();
                int currentY = current.getY();
                caminoX.add(currentX); 
                caminoY.add(currentY);
                
                if (mapa[currentX][currentY] == 9){
                    return true;
                }

                mapa[currentX][currentY] = 7;
                
                Graphics2D g2d = (Graphics2D)jPanel1.getGraphics();
                for (int row = 0; row < mapa.length; row++) 
                {
                    for (int col = 0; col < mapa[0].length; col++)
                    {
                        Color color;
                        switch (mapa[row][col])
                        {
                            case 1:
                                color = Color.BLACK; 
                                break;
                            case 9:
                                color = Color.red; 
                                break;
                            case 6:
                                color = Color.green;
                                break;
                            case 7:
                                color = Color.blue;
                                break;
                            default:
                                color = Color.white;
                        }
                        g2d.setColor(color);
                        g2d.fillRect(20 * col, 20 * row, 20, 20);
                        g2d.setColor(Color.gray);
                        g2d.drawRect(20 * col, 20 * row, 20, 20);
                    }
                }
                
                try {
                    Thread.sleep(1); 
                } catch (InterruptedException e) {
                    System.out.print("ERROR");
                }
                
                for (int[] dir : directions) {
                    int nextX = currentX + dir[0];
                    int nextY = currentY + dir[1];

                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && (mapa[nextX][nextY] == 0 || mapa[nextX][nextY] == 9)) {
                        queue.add(new Nodo(nextX, nextY, current));
                        listaNodos.add(new Nodo(nextX, nextY, current));
                    } 
                }
            }  
            return true;
        }
        
        public void dibujarCamino(ArrayList<Nodo> listaNodos){
            Nodo ultimo = listaNodos.get(listaNodos.size() - 2);
            
            while (ultimo != null){
                mapa[ultimo.getX()][ultimo.getY()] = 6;
                ultimo = ultimo.getPadre();
            }
            
            Graphics2D g2d = (Graphics2D)jPanel1.getGraphics();
            for (int row = 0; row < mapa.length; row++) 
            {
                for (int col = 0; col < mapa[0].length; col++)
                {
                    Color color;
                    
                    switch (mapa[row][col])
                    {
                        case 1:
                            color = Color.BLACK; 
                            break;
                        case 9:
                            color = Color.red; 
                            break;
                        case 6:
                            color = Color.green;
                            break;
                        default:
                            color = Color.white;
                    }
                    g2d.setColor(color);
                    g2d.fillRect(20 * col, 20 * row, 20, 20);
                    g2d.setColor(Color.gray);
                    g2d.drawRect(20 * col, 20 * row, 20, 20);
                }
            }
        }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(551, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BusquedaAnchura(mapa, 1,1,caminoX, caminoY);
        dibujarCamino(listaNodos);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
