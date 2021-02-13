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
       PreparedStatement q=null;
       PreparedStatement z=null;
       Statement d=null;        
       Scanner s=new Scanner(System.in);
       //int dg=5;
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
                   //System.out.println(ur)
                   double y=Math.random() * 99;
                   int x=(int)y;
                   System.out.println("Following are your credentials for any support inside our premises");
                   System.out.println("name : "+name);
                   System.out.println("UniqueReference "+x);
                   r=con.prepareStatement("insert into sample values(?,?,?,?)");
                   r.setInt(1,x);
                   r.setString(2,name);
                   r.setString(3,name);
                   r.setInt(4,0);
                   //System.out.println("Entering");
                   int n=r.executeUpdate();
                   if(r==null)
                   {
                           System.out.println("Lol");
                   }
                   //con.close();
                   System.out.println(n);
                   //catch(Exception e){}
           //We need to call registration function here
                   break;
           case 2: System.out.println("Its glad that you wish to avail our services ");
           /* We need to call the services function here */
                   System.out.println("Enter your ur");
                   int c=s.nextInt();
                   ///CONTINUE FROM HERE
                   d=con.createStatement();
                   ResultSet rs=d.executeQuery("select name from sample where roll = "+c);
                   if(rs.next())
                   System.out.println(rs.getString(1));
                   service();
                   //System.out.println(pr);
                   q=con.prepareStatement("update sample set bill = ? where roll = ? ");
                   q.setInt(1,pr);
                   q.setInt(2,c);
                   int i=q.executeUpdate();
                   System.out.println(i);
                   break;
           case 3: System.out.println("Thanks for spending your time in our Hotel ");
           //We need to call Billing function here
                   System.out.println("Enter your ur");
                   int h=s.nextInt();
                   ///CONTINUE FROM HERE
                   d=con.createStatement();
                   ResultSet ds=d.executeQuery("select name,bill from sample where roll = "+h);
                   if(ds.next())
                   System.out.println(ds.getString(1) +"  "+ ds.getInt(2));
                   int pay=ds.getInt(2);
                   System.out.println("Your bill is "+pay+" \n Pay the bill ");
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
        static int i=0;
        int pr=0;
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
               /* System.out.println("Following are your credentials for any support inside our premises");
                System.out.println("name : "+name);
                System.out.println("UniqueReference "); */
                amt=amt*days;
                System.out.println("Your rooms bill is "+amt);
                System.out.println("Please pay this amount in advance as we dont charge for any other services till your exit.If paid enter 1 ");
                //String x=new String();
                int check =Sc.nextInt();
                if(check==1){
                System.out.println("Yess,you can take your room,Dont forget to ping us for any services/support ");
                i++;
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
      public void service(){
              System.out.println("********************************* \n And Welcome to Services Department");
              System.out.println("Menu of Services : \n 1.Doctor Consultation \n 2.Rent for a car \n"+ 
              "3.Laundry and Cleaning \n 4.Misc ");
              System.out.println("Enter number against wished Service ");
              int ch=Sc.nextInt();
              //int pr=0;
              switch(ch)
              {
                case 1: System.out.println("Doctor is on the way :) ");
                        pr+=100;
                        break;
                case 2: System.out.println("Your Cab is booked ");
                        pr+=300;
                        break;
                case 3: System.out.println("Cleaning staff will be coming for cleaning");
                        pr+=400;
                        break;
                case 4: System.out.println("Please call our staff for other services assistance ");
                        break;
                default: System.out.println("Please enter correct choice ");                        
              }
      }
}        /* public static void main(String ar[]){
              new Start().regiser(); */
