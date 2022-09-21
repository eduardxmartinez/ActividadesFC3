import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("¿Cuantas fases de fibonacci desea calcular?");
            int n = sc.nextInt();
            System.out.print("Resultado: ");
            System.out.println(fibo(n));
        }
    }
    
    public static int fibo(int n){
        if(n <= 1){
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
        
    }
}