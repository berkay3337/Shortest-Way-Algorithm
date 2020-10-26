/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.awt.List;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Berkay
 */
public class Node {
    
    public String city_name;
    public int city_plate;
    public ArrayList<Node> neighbour=new ArrayList<Node>();
    public ArrayList<Integer> distance=new ArrayList();
    
    public Node(String city_name,int city_plate){
        
        this.city_name=city_name;
        this.city_plate=city_plate;
        
        
    }
    
    public void addNeighbour(Node n){
        
        
        neighbour.add(n);
        

        
    }
    
    public void addDistance(int d){
        
       distance.add(d);    
        
        
    }
    
    
    
}
