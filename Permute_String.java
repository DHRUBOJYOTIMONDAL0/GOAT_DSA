import java.util.Scanner;

public class Permute_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        sc.close();
        permute(str, 0, str.length() - 1);
    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }
        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            permute(str, left + 1, right);
            str = swap(str, left, i); 
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
