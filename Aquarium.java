package com.xworkz.constructor.dec1;

public class Aquarium {
       public int numberOfFishes;
       public String shape;
       public String size;
        
       public Aquarium() {
    	   System.out.println("invoked default");
       }
       
       public Aquarium(int numberOfFishes) {
    	   System.out.println("number of fishes");
    	   this.numberOfFishes=numberOfFishes;
       }
       public Aquarium(String shape) {
    	   System.out.println("shape of fish tank");
    	   this.shape=shape;
       }
       public Aquarium(String shape,String size) {
    	   System.out.println("shape and size of fish tank");
    	   this.shape=shape;
    	   this.size=size;
       }
       public Aquarium(String shape,int numberOfFishes) {
    	   System.out.println("shape and number of fish tank");
    	   this.shape=shape;
    	   this.numberOfFishes=numberOfFishes;
       }
       
}