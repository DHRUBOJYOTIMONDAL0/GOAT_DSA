import java.util.Scanner;

public class Powerset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a stirng: ");
        String str = sc.nextLine();
        sc.close();
        power_set(str, 0, "");
        
    }
    public static void power_set(String str, int index, String curr){
            if (index == str.length()){
                System.out.println(curr);
                return;
            }
            power_set(str, index +1, curr + str.charAt(index));
            power_set(str, index +1, curr);
        }
}
