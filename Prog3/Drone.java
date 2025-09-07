package transport; 

public class Drone extends Vehicle  implements IPayable{ 

public Drone(String id) { 
 super(id); 
  System.out.println("Drone() constructor called"); 
 // TODO Auto-generated constructor stub 
} 

@Override 
public void deliver(String item, String place) { 
 // TODO Auto-generated method stub 
 if(!SecurityRules.canFly(place)){ 
  System.out.println("Delivery to"+place+"is blocked by security:"); 
  return ; 
   
 } 
 System.out.println("Delivering " + " to "+ place  + " by Drone."); 
} 
 @Override 
public double cost(double distanceKm) { 
  return 20*distanceKm; 
 } 
} 
