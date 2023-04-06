/* For taking the user input we have to import scanner function in the utils package


 */
import java.util.Scanner; // import the Scanner class

public class User_input
{
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);
    }
}