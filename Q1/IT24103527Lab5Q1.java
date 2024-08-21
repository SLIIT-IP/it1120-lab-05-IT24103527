import java.util.Scanner;
             public class IT24103527Lab5Q1 {
             public static void main(String[] args) {

//Declaring variables
           int number_1 , number_2 , number_3 , min , max ;

//Crate an object called input to Scanner class 
            Scanner input = new Scanner(System.in) ; 

//Take user inputs
            System.out.println("Enter the first integer") ; 
            number_1 = input.nextInt() ; 
            System.out.println("Enter the second integer") ;
            number_2 = input.nextInt() ;       
            System.out.println("Enter the third integer") ; 
            number_3 = input.nextInt() ; 

//First output 
           System.out.println("User entered numbers are :"+number_1 +" " +number_2 +" " +number_3) ; 

//Checking the conditions 
       if(number_1>number_2 && number_2>number_3)
    {
           max =number_1 ;
           min = number_3 ;   }
      else
    {         
           min = number_1 ; 
           max = number_3 ;    } 

     if(number_1>number_3 && number_3>number_2) 
 {
        max= number_1 ; 
        min = number_2 ;   }
     else
 {
        max = number_2 ;
        min = number_1 ;    }

     if(number_2>number_1 && number_1>number_3) 
{
         max = number_2 ; 
         min = number_3 ;   }
    else
 {
         min =number_2 ;
         max = number_3 ;   }

//Final outputs
        System.out.println("The smallest number is :" +min) ;
        System.out.println("The largest number is :" +max) ;
      }
}   
