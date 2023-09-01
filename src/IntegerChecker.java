import java.util.Scanner;

public class IntegerChecker {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= obj.nextInt();
        if(num>0){
            System.out.println("It is positive integer.");
        }
        else if(num==0){
            System.out.println("Entered number is 0");
        }
        else{
            System.out.println("It is negative integer.");
        }
    }
}
