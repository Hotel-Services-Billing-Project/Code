import java.util.*;
class Start
{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println();
       System.out.println("***************************");
       System.out.println("Welcome to ABC Hotel");
       System.out.println("***************************");
       System.out.println("Menu : 1.Register a room \n 2.Avail Services \n 3.Exciting the Hotel ");
       System.out.println("Enter the number against the options to proceed ");
       int t=s.nextInt();
       switch(t)
       {
           case 1: System.out.println("You are in a step closer to regiser the room ");
           //We need to call registration function here
                   break;
           case 2: System.out.println("Its glad that you wish to avail our services ");
           /* We need to call the services function here */
                   break;
           case 3: System.out.println("Thanks for spending your time in our Hotel ");
           //We need to call Billing function here
                   break;
           default:System.out.println("Please Enter a correct option :) ");                       
       }
}}