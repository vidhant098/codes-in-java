 class  overloading {
    public static void main(String[] args) { 
        inherit  obj= new inherit ()  ; 
      obj.sum(23); 
      obj.sum(23 , 23 ); 
      obj.sum(23 , 23 , 34);

        
    }

 } 
class parents{
    void sum( int a )  
    {
        System.out.println(a );
    } 
     void sum( int a,  int b ){
        System.out.println(a+b);
     } 
     void  sum(int a , int b  , int c )
     {
        System.out.println(a+b+c);
     }
} 
 class inherit  extends parents
  {  
       
}