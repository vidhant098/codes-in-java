   package exce; 

  import java.util.Scanner; 
 
import java.nio.channels.Pipe.SourceChannel;

public class trycatch { 
      public static void main(String[] args) { 
         
         int a = 10  ;
          int b = 0 ; 
           try{ 
             int c = a/b ; 
            System.out.println(c); 
        } 
         catch(Exception e ) { 
            System.out.println( " cant devide " +e);

         }   
            int [] arr={ 1,2,3,4} ;  
            try{
             System.out.println(arr[6]); 
            }
             catch(Exception e)
             {
            System.out.println( e) ;
             }  
             /// dor input 

      //     System.out.println(" sauucssfully done "); 
      //      Scanner sc = new Scanner(System.in);

           //   (4. )   
           ///  for string 
           ///    
           String str = null  ;  
try{
            System.out.println(str.toUpperCase());  
           
      }   
       catch(Exception e) { 
                             System.out.println( "   change nahi kar sakate  "+e) ; 
            } 
    
}
}