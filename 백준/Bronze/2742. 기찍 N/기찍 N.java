import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        for(int i = N; i >0; i --){
            System.out.println(N);
            N--;
            
        }
    }
}