package transport; 

public class Main { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  Ebike e=new Ebike("EB-101",50); 
  e.deliver("sandwich","Library"); 
     Drone d = new Drone("DR-1"); 
         d.deliver("Notes", "ExamCell");   
         d.deliver("USB", "CSE Block" ); 
         double bill=d.cost(5); 
         System.out.println("Drone delivary cost:Rs"+bill); 
 
 } 
 
}