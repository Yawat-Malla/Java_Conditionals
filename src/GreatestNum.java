import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        System.out.println("Enter  first number: ");
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter  second number: ");
        Scanner obj2= new Scanner(System.in);

        int num1 = obj1.nextInt();
        int num2 = obj2.nextInt();

        if(num1>num2){
            System.out.println(num1+" is the greatest number");
        }
        else if(num1==num2){
            System.out.println("They are equal.");
        }
        else{
            System.out.println(num2+ " is the greatest number.");
        }

    }
}
