import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num= obj.nextInt();
        if(num%2==0){
            System.out.println("The entered number is even.");
        }
        else{
            System.out.println("The entered number is odd.");
        }
    }
}
