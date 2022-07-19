import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakliğini giriniz: ");
        temp = input.nextInt();

        if (temp <= 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if(temp > 5 && temp <= 15){
            System.out.println("Sinemaya gidebilirsin.");
        }else if (15 < temp && temp<=25){
            System.out.println("Piknige gidebilirsin.");
        } else if (temp > 25) {
            System.out.println("Yuzebilrisin.");

        }

    }
}