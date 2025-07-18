public class Basic{
    public static void main(String[] args){
        int n = 4;
        int m = 3;
        int count = count(n, m);
        System.out.println(count);
    }

    public static int count(int n, int m) {
        if(n == 1 || m == 1){
            return 1;
        }
        return count(n-1, m) + count(n, m-1);
    }
}