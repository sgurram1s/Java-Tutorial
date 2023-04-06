import java.util.Scanner;

public class Methods{

    static void pin(int pin,boolean card){
        Scanner input = new Scanner(System.in);

        if (pin == 1234) {
            home(card);
        }
        else{
            for (int i=0;i<4;i++) {
                System.out.print("Please enter the correct pin: ");
                pin = input.nextInt();
                if(pin==1234){
                    home(card);
                    break;
                }
            }
            card = false;
        }
    }
    static void home(boolean card){
        Scanner input = new Scanner(System.in);
        while(card==true) {
            if (card == true) {
                System.out.println("1:\tCheck Balance\n2:\tWithdraw amount\n3:\tDeposit cash");
                int value = input.nextInt();
                switch (value) {
                    case 1:
                        checkBalance(50000);
                        break;
                    case 2:
                        withdraw(20000);
                        break;
                    case 3:
                        deposit(10000);
                        break;
                    default:
                        card = false;
                        break;
                }
            }
        }
    }
    static void checkBalance(int balance){
        System.out.println("Your balance is: $"+balance);
    }
    static void withdraw(int withdraw){
        System.out.println("Do you want to withdraw: $"+withdraw);
    }
    static void deposit(int deposit){
        System.out.println("Do you want to deposit the amount: $"+deposit);
    }
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter true for continuing");
            boolean card = input.nextBoolean();
            if (card == true) {
                System.out.println("Enter the pin");
                int pin = input.nextInt();
                pin(pin, card);
            }
        }
    }
}