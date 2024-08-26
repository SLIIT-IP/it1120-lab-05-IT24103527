import java.util.Scanner ; 
        public class IT24103527Lab5Q3 {
        public static void main(String[] args) { 

//Declaring variables 
        int StartDay , EndDay ,  no_of_days , Total , DisRate ; 
         int RoomCharge = 48000 ;

//create an object called input to Scanner class 
           Scanner input = new Scanner(System.in) ; 

//Take user inputs 
          System.out.println("Enter Start date(1-31) :") ;
          StartDay = input . nextInt() ; 
          System.out.println("Enter End date(1-31):") ; 
          EndDay = input . nextInt() ; 

//Checking the conditions and calculations
        if(StartDay<1 || StartDay>31 || EndDay<1||EndDay>31) 
{ 
        System.out.println("Days must be between 1 and 31") ; 
              return ; }

        if(StartDay>EndDay) 
{
        System.out.println("Start date must be less than End date") ;  
             return ;  }
 
      
           no_of_days =(EndDay - StartDay) ;

        if(no_of_days>=0 && no_of_days<3)
 {      DisRate = 0 ;  
                           }
      else if(no_of_days==3 || no_of_days==4)
 {      DisRate = 10 ;
                         }

      else 
 {     DisRate = 20 ; 
                           }
  

         Total = (RoomCharge * no_of_days) - ((RoomCharge * no_of_days) * DisRate/100) ;
         

//Display outputs 
         System.out.println("Room charge per day: Rs.48000/=") ; 
         System.out.println("Number of days reserved :" +no_of_days) ; 
         System.out.println("Total Amount to be paid :" +Total) ; 
    }
}
           
          