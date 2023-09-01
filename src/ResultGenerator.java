import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        System.out.println("Enter marks for Maths");
        Scanner obj1= new Scanner(System.in);
        double sub1= obj1.nextInt();

        System.out.println("Enter marks for English");
        Scanner obj2= new Scanner(System.in);
        double sub2= obj2.nextInt();

        System.out.println("Enter marks for Nepali");
        Scanner obj3= new Scanner(System.in);
        double sub3= obj3.nextInt();


        double percentage = ((sub1+sub2+sub3)/300)*100;
        System.out.println(percentage);
        if(percentage>100){
            System.out.println("Invalid input");
        }
        else if(percentage>=90){
            System.out.println("Grade= Distinction");
        }
        else if(percentage<90 & percentage>=80){
            System.out.println("Grade= First division");
        }
        else if(percentage<80 & percentage>=70) {
            System.out.println("Grade= Second Divison");
        }
        else{
            System.out.println("Grade= Fail");
        }
    }
}
