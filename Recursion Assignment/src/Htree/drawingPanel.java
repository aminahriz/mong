
package Htree;

import java.awt.Graphics;

public class drawingPanel extends javax.swing.JPanel {

    //control depth variable from frame textbox
    int controlDepth;

    public drawingPanel() {
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {
        //calling contstructor of the paintComponent()
        super.paintComponent(g);
        //calling the recursive htree method with the inputted control depth
        Htree(g, 300, getWidth() / 2, getHeight() / 2, controlDepth);
    }

    //method to get the user inputted depth from frame
    public void depth(int x) {
        //control depth is set to the input from the frame's textbox
        controlDepth = x;
        //repaints the frame so the fractal with the inputted depth is displayed
        repaint();
        //end method
    }

    //method that calculates the center points of the four tips
    public int[] fourPoints(int size, int x, int y) {
        int[] points = new int[4];
        points[0] = x - size / 2; //x coordinate for the left hand point
        points[1] = x + size / 2; //x coordinate for the right hand point
        points[2] = y - size / 2; //y coordinate for the bottom point
        points[3] = y + size / 2; //y coordinate for the top points

        return points;
    }

    //method to contruct an H of the given parameters
    public void drawAnH(Graphics g, int size, int x, int y) {
        //using method to get coordinates of the tips of the H
        int[] tips = fourPoints(size, x, y);

        //drawing the H
        g.drawLine(tips[1], tips[2], tips[1], tips[3]);  //right line of the H
        g.drawLine(tips[0], tips[2], tips[0], tips[3]);    //left line of the H
        g.drawLine(tips[1], y, tips[0], y);  //connecting line of the H

        //end method
    }

    //the recursive method that creates an H tree
    public void Htree(Graphics g, int size, int x, int y, int n) {
        
        
        //base case: if the depth is 0
        if (n == 0) {
            //ends the method
            return;
            //end if 
        }
        //recursive part
        //draw an H centered at (x,y) with the given size
        drawAnH(g, size, x, y);

        //using method to get center coordinates of H's at tips
        int[] points = fourPoints(size, x, y);

        //recursively calling function to create the smaller Hs to be half the siz of the "father" H at n-1 depth
        Htree(g, size / 2, points[0], points[3], n - 1); //smaller h at top left tip
        Htree(g, size / 2, points[0], points[2], n - 1);   //smaller h at bottom left tip
        Htree(g, size / 2, points[1], points[3], n - 1);    //smaller h at top right tip
        Htree(g, size / 2, points[1], points[2], n - 1);    //smaller h at bottom right tip
        //end method
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
