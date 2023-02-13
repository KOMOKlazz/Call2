import java.util.Scanner;

public class n {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter start number");
        int x = sc.nextInt(0);
        System.out.println("Enter times");
        int n = sc.nextInt(0);
        for(int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x = x + (x + i) + 1;
        }
    }
    }
}
