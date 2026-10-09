import java.util.Scanner;
class convert{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        double mark=scan.nextDouble();
        scan.nextLine();
        String dept=scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark/10 + "/10");
        System.out.println("Department: " + dept);
    }
}