import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

//        if (N == 4 || N == 7){
//            System.out.println(-1);
//        }
//        else if (N % 5 == 0){
//            System.out.println(N /5);
//        }
//        else if (N % 5 == 1 || N % 5 == 3){
//            System.out.println((N / 5) + 1);
//        }
//        else if (N % 5 == 2 || N % 5 ==4){
//            System.out.println((N/5) + 2);
//        }

        int A = N/5;
        int C = N%5;

        if (C == 0){
            System.out.println(A);
        }
        else if (C != 0){
            int e = C/3;
            if(e == 0){
                System.out.println(A +1);
            }
            else if(e != 3){
                System.out.println(-1);
            }
        }
    }
}
