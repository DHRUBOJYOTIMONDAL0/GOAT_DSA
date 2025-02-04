import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        //int n =4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet your number: ");
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
    
}
