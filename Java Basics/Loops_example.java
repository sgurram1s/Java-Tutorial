/* This example is for better understanding all the looping ad conditional statements
In this I am developing a basic banking system using do-while, for, and if else conditional statements.
 */

import java.util.Scanner;
public class Loop{
    public static void main(String [] args) {
        boolean card;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter true for proceeding: ");
            card = input.nextBoolean();
            if (card == true){
                System.out.print("Enter pin: ");
                int pin = input.nextInt();
                int i = 0;

                do {
                    if (pin == 1234) {
                        while (card == true) {
                            System.out.println("1:\tCheck Balance\n2:\tWithdraw amount\n3:\tDeposit cash");
                            int value = input.nextInt();

                            switch (value) {
                                case 1:
                                    System.out.println("Your balance amount is: ");
                                    break;
                                case 2:
                                    System.out.println("You are withdraw amount is: ");
                                    break;
                                case 3:
                                    System.out.println("Your Deposit amount is: ");
                                    break;
                                default:
                                    card = false;
                                    break;

                            }
                        }
                    } else {
                        System.out.print("Please enter valid pin: ");
                        pin = input.nextInt();
                        i++;
                        if (i == 3) {
                            card = false;
                            break;

                        }
                    }

                }while(card == true);
            }
        }while(true);
    }
}
