import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while(true) {
            Scanner command = new Scanner(System.in);
            System.out.println("Insert a MAC address or insert out: ");
            String option = command.nextLine();
            if(option.equals("out")) {
                System.exit(0);
            }else{
                System.out.println(ClientRestApproach.RequestMacAddress(option));
            }
        }
    }
}