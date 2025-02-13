import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nim : ");
        String nim = sc.nextLine();

        System.out.print("Masukan 2 Digit Nim Belakang : ");
        int n = sc.nextInt();

        System.out.println("================================");

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 && i == 10) {
                continue;
            } if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
