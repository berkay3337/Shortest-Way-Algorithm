/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author Berkay
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Line2D.Float;



public class Map extends JFrame {
    
    public ImageIcon image;
    public JLabel label;

    public Map() {
        setLayout(new FlowLayout());
        image=new ImageIcon(getClass().getResource("map.png"));
        label=new JLabel(image);
        add(label);
        System.out.println("Çalışıyor");
        
       
        
    }
    
    public void paint(Graphics g){
        
        
                
        g.drawLine(250, 200, 200, 200);
        
        
        
        
    }
  
     
          
         
            
        
        
    
    
    
}
