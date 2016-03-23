/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.bean;
import java.io.Serializable;






/**
 *
 * @author Simi510
 */
public class MapBean implements  Serializable{
    private String origin;
    private String destination;
    private String price;
    private String mpg;
    private String distance;
    private String gasType;
    private String ppm;
    private String gallons;
    private String gasCost;
    private String totalCost;
    private String ppmCost;
    private String id;

    public MapBean() {
        
    }

    
    
    public MapBean(String id, String origin, String destination, String price, String mpg,
    String distance, String gasType, String ppm, String gallons, String gasCost, String ppmCost, String totalCost) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.mpg = mpg;
        this.distance = distance;
        this.gasType = gasType;
        this.ppm = ppm;
        this.gallons = gallons;
        this.gasCost = gasCost;
        this.totalCost = totalCost;
        this.ppmCost = ppmCost;
        
        
            
           
           
            
           
    }
    
    
    public MapBean(String origin, String destination, String price, String mpg,
    String distance, String gasType, String ppm, String gallons, String gasCost, String ppmCost, String totalCost) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.mpg = mpg;
        this.distance = distance;
        this.gasType = gasType;
        this.ppm = ppm;
        this.gallons = gallons;
        this.gasCost = gasCost;
        this.totalCost = totalCost;
        this.ppmCost = ppmCost;
        
        
            
           
           
            
           
    }



    public MapBean(String origin, String destination, String price, String mpg, String distance, String gasType) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.mpg = mpg;
        this.distance = distance;
        this.gasType = gasType;
        
        
        
    }
    
    public MapBean(String price, String mpg, String distance, String gasType) {

        this.price = price;
        this.mpg = mpg;
        this.distance = distance;
        this.gasType = gasType;
        
        
        
    }
    
    
    
    /*
    public String setParm(String origin, String destination, String Price, String mpg) {
        
        
    }
*/
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMpg() {
        return mpg;
    }

    public void setMpg(String mpg) {
        this.mpg = mpg;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public String getDistance() {
        return distance;
    }

    public String getGasType() {
        return gasType;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }


    public void setGasCost(String gasCost) {
        this.gasCost = gasCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getPpm() {
        return ppm;
    }



    public String getGasCost() {
        return gasCost;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setGallons(String gallons) {
        this.gallons = gallons;
    }

    public String getGallons() {
        return gallons;
    }

    public String getPpmCost() {
        return ppmCost;
    }

    public void setPpmCost(String ppmCost) {
        this.ppmCost = ppmCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
    
}
