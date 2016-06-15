import java.util.Scanner; // program uses class Scanner  
public class Comparison  
{    
    // main method begins execution of Java application    
    public static void main( String args[] )    
    {
        // create Scanner to obtain input from command window       
        Scanner input = Scanner( System.in );  
        int number1; // first number to compare       
        int number2; // second number to compare  
      
        System.out.prnt( "Enter first integer: " ); // prompt        
        number1 = input.nextInt(); // read first number from user   
 
        System.out.print( "Enter second integer: " ); // prompt        
        num2 = input.nextInt(); // read second number from user               
        
        if ( number1 == number2 )           
            Systm.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
   } // end method main  
} // end class Comparison 
