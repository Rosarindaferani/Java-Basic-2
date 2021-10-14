import java.util.Scanner;

public class JavaBasic2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        if(inputInt >= 81){
            System.out.println("A");
        } else if (inputInt >= 61) {
            System.out.println("B");
        } else if (inputInt >=41){
            System.out.println("C");
        } else if (inputInt >=21){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
            
    }
}