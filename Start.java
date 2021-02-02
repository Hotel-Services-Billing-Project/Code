import java.util.*;
public class Start extends A
{
    public static void main(String args[]){
            new Start();
            }
       Start(){     
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
                   register();
           //We need to call registration function here
                   break;
           case 2: System.out.println("Its glad that you wish to avail our services ");
           /* We need to call the services function here */
                   break;
           case 3: System.out.println("Thanks for spending your time in our Hotel ");
           //We need to call Billing function here
                   break;
          default:System.out.println("Please Enter a correct option :) ");                       
       }}
}  
class A{
        Scanner Sc=new Scanner(System.in);
        String name=new String();;
        int days;
        int amt=1000;
        int[] a=new int[100];
        static int i=0,ur=5198;
        public void register(){
                System.out.println("We are having sufficient number of rooms to facilitate Customers ");
                System.out.print("  To proceed,we need certain details.\n Please enter your name : ");
                name=Sc.nextLine();
                System.out.print("Hello "+name+" how many days do you want to stay : ");
                days=Sc.nextInt();
                a[i]=1;
                System.out.println("Your room is registered successfully...");
                System.out.println("Following are your credentials for any support inside our premises");
                System.out.println("name : "+name);
                System.out.println("UniqueReference "+ ur);
                amt=amt*days;
                System.out.println("Your rooms bill is "+amt);
                System.out.println("Please pay this amount in advance as we dont charge for any other services till your exit.If paid enter 1 ");
                //String x=new String();
                int check =Sc.nextInt();
                if(check==1){
                System.out.println("Yess,you can take your room,Dont forget to ping us for any services/support ");
                i++;
                ur+=7;
                }
                else
                 {
                        System.out.println("You are redirecting to main page");
                        //should implement
                 }
        }
      }      /* public static void main(String ar[]){
              new Start().regiser(); */
class B{
    Scanner Sc=new Scanner(System.in);
    System.out.println("Please enter your unique reference code for services");
    ur=Sc.nextint();
    System.out.println("Please choose what type of services you require from below");
    System.out.println("Menu : 1.Cleaning \n 2.Food Services \n 3.Laundry \n 4.Medical Service \n 5.Booking a Cab \n ");
    System.out.println("Thank you for your patience, we will get back to you in no time :) ");
    int c=s.nextInt();
    public void reception(){
     System.out.println("Thank you for calling, we will provide services in no time");
     amt=amt+300;}
    public void reception1(){
     System.out.println("Thank you for calling,be ready for cab");
     amt=amt+500;} 
    public void restaurant(){
	if(order==VEG)
	System.out.println("Thank You for choosing Veg section, we will bring your order Fresh and Hot");
	amt=amt+400;
	else
	System.out.println("Thank You for choosing NON-Veg section, we will bring your order Fresh and Hot");
	amt=amt+500;}
switch(c)
       {
           case 1: System.out.println("We will send the Cleaning team to your room \n");
                   reception();
           //We need to call reception here for cleaning service
                   break;
           case 2: System.out.println("Please state whether you prefere VEG or NON-VEG, it might take atleast 10 minutes for your order \n");
                   order=Sc.nextLine;
		   restaurant();
	   // We need to call the restaurant here
                   break;
           case 3: System.out.println("Our team will there at your room shortly \n");
		   reception();
           //We need to call reception here for laundry
                   break;
	   case 4: System.out.println("Please tell your emergency doctor will be arriving");
		   reception();
	   //We need to call reception for Doctor or medical emergency
	   case 5: System.out.println("Please state your destnation for cab services");
		   reception1();
	   //We need to call reception for cab
          default:System.out.println("Please Enter a correct option :) ");                       
       }}
