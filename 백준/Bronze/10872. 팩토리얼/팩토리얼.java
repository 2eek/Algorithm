import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();
      
        int sum = 1;
        
        //N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다.
        while(N != 0){
         sum = sum * N;
            N--;
        }
        System.out.println(sum);
    }    
    
}