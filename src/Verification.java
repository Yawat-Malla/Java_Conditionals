import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int UserAge= obj.nextInt();
        if(UserAge==17){
            System.out.println("Welcome Yawat");
        }
        else{
            System.out.println("Verification failed");
        }
    }
}

