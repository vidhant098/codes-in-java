class InheritancePrac
{  public static void main(String[] args) {
     //call for first code   
    manager obj =new manager(); 
       obj.work();  
       obj.attendmeeting() ;   
        // code for seconf code 
        monitor obj2 = new monitor() ;  
         obj2.name(); 
          obj2.showclass(); 
          obj2.position() ; 


}

}   

// code no first 
 class employee{
    void work()
    {
        System.out.println("employee works ");
    }
 }  

 class manager extends employee{
    void attendmeeting()
    {
        System.out.println("manager attenda meetings ");
    }
 }  

     

//   code no second
  class person{
     void  name() 
     {
        System.out.println(" vidhant "); 
     }
  }  
   class  student extends person 
   { 
       void showclass()
       {
        System.out.println(" seconnd year");
       }
   }
  
   class  monitor extends student
   { 
       void position()
       {
        System.out.println(" monitor");
       }
   }   
    
  
 
