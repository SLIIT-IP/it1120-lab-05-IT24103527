import java.util.Scanner;
             public class IT24103527Lab5Q2 {
             public static void main(String[] args) {
//Declaring variables 
             int no_Of_new_members ; 
//Crate an object called input to Scanner class 
            Scanner input = new Scanner(System.in) ; 
//Taking user inputs
            System.out.println("Enter the number of new members introduced :") ; 
            no_Of_new_members = input.nextInt() ;
//Checking the conditions 
     if(no_Of_new_members<0) 
{
         System.out.println("Input must be a number 0 or grater") ;  } 
  else
{
      switch(no_Of_new_members)
  {
         case 0 : System.out.print("No prize") ; 
                     break ;
         case 1 :  System.out.print("Prize is a :Pen") ; 
                        break ;
         case 2 : System.out.print("Prize is a:Umbrella") ; 
                      break ; 
         case 3 : System.out.print("Prize is a:Bag") ; 
                      break ; 
         case 4 : System.out.print("Prize is a:Travelling chair") ; 
                      break ; 
        default :System.out.print("Prize is a:Headphone") ;    } 
           
          }
      

    }
}
