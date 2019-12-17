// * CSC 120, PA4
// * Dana Lucas 
// * 10/18/2019


import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author lucasdm2022
 */


public class Moon {
   
    private String name;
    private Integer radius;
    private Double mass, surfaceGravity;
    private Boolean oxygenInAtmosphere;
    
   public Moon(String n, Integer r, Double m, Double sg, Boolean oia){
       name = n;
       radius = r;
       mass = m;
       surfaceGravity = sg;
       oxygenInAtmosphere = oia;  
   } // end of constructor
   
   public String getName(){
       return name;
   }
   
   public Integer getRadius(){
       return radius;
   }
   
   public Double getMass(){
       return mass;
   }
   
   public Double getSurfaceGravity(){
       return surfaceGravity;
   } 
   
   public Boolean getOxygenInAtmosphere(){
       return oxygenInAtmosphere;
   }

   public void setName(String n){
       name = n;
   }
   
   public void setRadius(Integer r){
       radius = r;
   }
   
   public void setMass(Double m){
       mass = m;
   }
  
   public void setSurfaceGravity(Double sg){
       surfaceGravity = sg;
   }
   
   public void setOxygenInAtmosphere(Boolean oia){
       oxygenInAtmosphere = oia;
   }
   
   public Double calculateCircumference(){
       return radius*2*Math.PI; 
   }
   
   public Double calculateEscapeVelocity(){
       return Math.sqrt(2.0 * (6.67*Math.pow(10,-11)) * mass / (radius * Math.pow(10,3)))*60*60/1000;
       // This equation is the escape velocity formula, where 6.67E-11 is the gravitational constant. The values at the end are just getting the value into units of km/hr.
   }
   
   public String toString(){
       DecimalFormat massFormat = new DecimalFormat("0.00E00");
       String answer;
       answer = name + " has a radius of " + radius + " km, a mass of " + massFormat.format(mass) + " kg, and a surface gravity of " + massFormat.format(surfaceGravity) + " m/s^2."
               + '\n' + "It is " + oxygenInAtmosphere + " that " + name + " has oxygen in its atmosphere.";
       return answer;
   }
   
} // end of class
    
