/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;
import edu.csueb.cs3520.bean.MapBean;

import static java.awt.geom.Point2D.distance;

/**
 *
 * @author Simi510
 */
public class MapCalc {
    
    public double gasCost = 0;
    public double totalCost = 0;
    
    public void calculate(String distance, String price, String mpg, String gasType) {
            double myDistance = Double.parseDouble(distance);
            double myPrice = Double.parseDouble(price);
            double myMpg = Double.parseDouble(mpg);
            double myGasType = Double.parseDouble(gasType);
            
            gasCost = ((myMpg * myDistance) * myGasType ) ;
            totalCost = (gasCost - myPrice);
            
            
            
    
    }
    
    public double gasCost() {
        return gasCost;
    }
    public double totalCost() {
        return totalCost;
    }
            
}
