import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter value want search: ");
        value = sc.nextInt();

        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Yeah!");
        }
    }
}
