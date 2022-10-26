import java.util.Scanner;

public class brawo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = sc.nextLine();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Brawo " + name);
        }
    }
}