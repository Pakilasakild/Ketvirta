import java.util.Scanner;

public class Main {
    public static boolean makes10 (int a , int b){
        if (a + b == 10 || a == 10 || b == 10){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (makes10(a,b)){
            System.out.println("They make 10");
        }
        else{
            System.out.println("They do not make 10");
        }
    }
}