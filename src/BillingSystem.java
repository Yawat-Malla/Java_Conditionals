import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        double total=0 ; String item="";
        String sano_butta="**********************";
        String lamo_butta="*********************************************************************";
        System.out.println(lamo_butta);
        System.out.println("*                              Yawat Cafe                           *");
        System.out.println(lamo_butta);
        System.out.println("                                                    ");
        System.out.println("Today's Menu");
        System.out.println(sano_butta);
        System.out.println("Food items      Price       ");
        System.out.println("Momo            80");
        System.out.println("Chowmein        70");
        System.out.println("Biriyani        90");
        System.out.println(sano_butta);
        System.out.println("Enter:");
        System.out.println("1 to order momo");
        System.out.println("2 to enter chowmein " );
        System.out.println("3 to enter biriyani.");
        System.out.println(sano_butta);
        Scanner obj= new Scanner(System.in);
        int  order= obj.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = obj.nextInt();
        if (order==1){
            item="momo";
            total = 80*quantity;
        }
        else if(order==2){
            item="chowmein";
            total = 70*quantity;
        }
        else if(order==3){
            item="biryani";
            total = 90*quantity;
        }
        else{
            System.out.println("Order invalid");
        }
        double VAT = (13*total)/100;
        double discount= (10*total)/100;
        double grand_total = total+VAT-discount;
        System.out.println(lamo_butta);
        System.out.println("       Items           Quantity            Total");
        System.out.println("     "+item + "          "+quantity+"            "+total);
        System.out.println("Total VAT: "+ VAT);
        System.out.println("Total discount: "+discount);
        System.out.println("Grand Total: "+grand_total);
        System.out.println(lamo_butta);
    }
}