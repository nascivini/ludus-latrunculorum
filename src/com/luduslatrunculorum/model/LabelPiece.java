/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luduslatrunculorum.model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author vinicius
 */
public class LabelPiece extends JLabel {

    public void paintComponentWithCircleWhite() {
        var g = this.getGraphics();
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawOval(5, 5, 60, 60);
        g.fillOval(5, 5, 60, 60);
    }
    
    public void paintComponentWithCircleBlack() {
        var g = this.getGraphics();
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(5, 5, 60, 60);
        g.fillOval(5, 5, 60, 60);
    }
    
    public void repaintComponent(){
        var g = this.getGraphics();
        super.paintComponent(g);
    }

}
