import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);

        System.out.print("Harmoniği hesaplanacak sayıyı giriniz : ");
        int sayi=scanner.nextInt();
        double total=0;
        for (int i=1;i<=sayi;i++){
            total+=1.0/i;
        }
        System.out.println(total);
    }
}
