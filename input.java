import java.util.Scanner;
class input{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + num);
        System.out.println("You entered: " + str);
    }
}