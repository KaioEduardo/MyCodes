/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooconcepts;

/**
 *
 * @author Kaio Eduardo
 */
public class POOConcepts {
class Pen{
    char color;
    char type;
    char brand;
    
    void changeColor(char newValue) {
         color = newValue;
    }
    void changeType(char newValue){
         type = newValue; 
    }
    void changeBrand(char newValue){
         brand = newValue;
    }
    void printStates(){
    System.out.println("color:" + color + "type:" + type + "brand" + brand );
    }
  

    public static void main(String[] args){
        // TODO code application logic here
      Pen color1 = new Pen();
      Pen type1 = new Pen();
      Pen brand1 = new Pen(); 
      
      color.changeColor();
      type.changeType();
      brand.changeBrand();
    }
      
    

    
    


}
}