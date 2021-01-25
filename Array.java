import java.util.Scanner;
class Array
{
    public static void main(String ar[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows and columns : ");
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a= new int[r][c];
        System.out.println("Enter "+r*c+" values");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
               a[i][j]=s.nextInt();
            }
        }
        System.out.println("Displaying your array ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}