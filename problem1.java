import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n, pos, value;

        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        pos = sc.nextInt();
        value = sc.nextInt();

        for (int i = n; i >= pos; i--)
            arr[i] = arr[i - 1];

        arr[pos - 1] = value;
        n++;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
