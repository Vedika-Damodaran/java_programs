import java.util.Scanner;
class compute{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();   
        int c=scan.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println("The value is: "+d/e);
        }
}