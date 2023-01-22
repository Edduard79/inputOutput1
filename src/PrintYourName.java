import java.util.Scanner;

public class PrintYourName {
    public PrintYourName(){
    }
    public static void main(String[] args){
        System.out.printf("Insert your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("Hello %s!!! ", name);



    }
}
