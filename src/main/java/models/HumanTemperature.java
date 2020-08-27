/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class HumanTemperature {
    Human human;
    Temperature temp;
    
    public HumanTemperature() {
        
    }
    
    public HumanTemperature(Human human, Temperature temp) {
        this.human = human;
        this.temp = temp;
    }
    
    public void setHuman(Human human) {
        this.human = human;
    }
    
    public Human getHuman() {
        return(this.human);
    }
    
    public void setTemperature(Temperature temp) {
        this.temp = temp;
    }
    
    public Temperature getTemperature() {
        return(this.temp);
    }
    
}
