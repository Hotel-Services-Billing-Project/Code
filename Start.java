import java.sql.*;
import java.util.*;
public class Start extends A
{
    public static void main(String args[]) throws Exception{
            new Start();
            }
       Start(){  
               try{  
       Class.forName("com.mysql.jdbc.Driver");

       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
       PreparedStatement r=null;        
       Scanner s=new Scanner(System.in);
       //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
       System.out.println();
       System.out.println("***************************");
       System.out.println("Welcome to ABC Hotel");
       System.out.println("***************************");
       System.out.println("Menu : 1.Register a room \n 2.Avail Services \n 3.Exiting the Hotel ");
       System.out.println("Enter the number against the options to proceed ");
       int t=s.nextInt();
       switch(t)
       {
           case 1: System.out.println("You are in a step closer to regiser the room ");
                   register();
                   //System.out.println(ur);
                   ur+=5;
                   r=con.prepareStatement("insert into sample values(?,?,?)");
                   r.setInt(1,ur);
                   r.setString(2,name);
                   r.setString(3,name);
                   System.out.println("Entering");
                   r.executeUpdate();
                   if(r==null)
                   {
                           System.out.println("Lol");
                   }
                   con.close();
                   //catch(Exception e){}
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
       catch(Exception e){}
}}  
class A{
        //try{
        Scanner Sc=new Scanner(System.in);
        String name=new String();
        int days;
        int amt=1000;
        int[] a=new int[100];
        static int i=0,ur=45;
           //Class.forName("com.mysql.jdbc.Driver");
           //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
           //Statement stmt=con.createStatement();
           //PreparedStatement r;
        public void register(){
                System.out.println("We are having sufficient number of rooms to facilitate Customers ");
                System.out.print("  To proceed,we need certain details.\n Please enter your name : ");
                name=Sc.nextLine();
                System.out.print("  Hello "+name+" how many days do you want to stay : ");
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
                ur++;
                //r=con.prepareStatement("insert into sample values(ur,name,'BCoM')");
                //r.executeUpdate();
                //con.close();
                }
                else
                 {
                        System.out.println("You are redirecting to main page");
                        //should implement
                 }
        } 
      //catch(Exception e){}
}
        /* public static void main(String ar[]){
              new Start().regiser(); */
import java.util.*;
public class Main extends utils
{
    public static void main(String args[])
    {
            while(true)
            {
                new Main();
            }
    }
            Main()
       {
        super();
       System.out.println();
       System.out.println("*********");
       System.out.println("Welcome to ABC Hotel");
       System.out.println("*********");
       System.out.println("Menu : 1.Register a room \n 2.Avail Services \n 3.Exiting the Hotel ");
       System.out.println("Enter the number against the options to proceed ");
       int t=Sc.nextInt();
       switch(t)
         {
           case 1: System.out.println("You are in a step closer to regiser the room ");
                   register();
           //We need to call registration function here
                   break;
           case 2: System.out.println("Its glad that you wish to avail our services ");
           /* We need to call the services function here */
                   Services();
                   break;
           case 3: System.out.println("Thanks for spending your time in our Hotel ");
           //We need to call Billing function here
                   billing();
                   break;
                   
          default:System.out.println("Please Enter a correct option :) ");                      
           }
       }
}  
class utils{
        int days;
        static int amt=1000;
        int [] a;
        String name,VEG,NONVEG,order;
        static int i=0,ur=5198;
        static Scanner Sc=new Scanner(System.in);
        utils(){
        name = "";
        days=0;
        a=new int[100];
        }
        public void register(){
                System.out.println("We are having sufficient number of rooms to facilitate Customers ");
                System.out.print("  To proceed,we need certain details.\n Please enter your name : ");
                Sc.nextLine();
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
        public void Services()
        {
            System.out.println("Please enter your unique reference code for services");
          ur=Sc.nextInt();
          System.out.println("Please choose what type of services you require from below");
          System.out.println("Menu : 1.Cleaning \n 2.Food Services \n 3.Laundry \n 4.Medical Service \n 5.Booking a Cab \n ");
            System.out.println("Thank you for your patience, we will get back to you in no time :) ");
           int c=Sc.nextInt();
           System.out.println("Thank you for calling, we will provide services in no time");
           
           
           switch(c)
           {
            case 1: System.out.println("We will send the Cleaning team to your room \n");
                   reception();
            //We need to call reception here for cleaning service
                   break;
            case 2: System.out.println("Please state whether you prefer VEG or NONVEG,by entering v or n , it might take atleast 10 minutes for your order ");
                    order=Sc.next();
                    restaurant();
        // We need to call the restaurant here
                   break;
            case 3: System.out.println("Our team will be there at your room shortly \n");
           reception();
            //We need to call reception here for laundry
                   break;
        case 4: System.out.println("Please tell your emergency doctor will be arriving");
           reception();
        //We need to call reception for Doctor or medical emergency
           break;
        case 5: System.out.println("Please state your destnation for cab services");
           reception1();
        //We need to call reception for cab
           break;
            default:System.out.println("Please Enter a correct option :) ");                      
           }
        }
        public void reception()
            {
                amt=amt+300;
             }
    public void reception1()
    {
     System.out.println("Thank you for calling,be ready for cab");
     amt=amt+500;
    }
    public void restaurant()
   {
    if(order.equals("v"))
       {
    System.out.println("Thank You for choosing Veg section, we will bring your order Fresh and Hot");
    amt=amt+400;
       }
    else if(order.equals("n"))
        {
            System.out.println("Thank You for choosing NON-Veg section, we will bring your order Fresh and Hot");
        amt=amt+500;
        }
    }
    public void billing()
        {
          System.out.println("Hope you had a pleasant stay\nPlease pay the following amount");
          System.out.println(amt+"\n.......Thank you.........");
          System.exit(0);
        }
 }
