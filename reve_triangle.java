package patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reve_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int row=1;row<=n;row++){
//            for(int col=1; col<=n-row+1;col++){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
        ///////another method
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=n;j++){
//                System.out.print("8");
//            }
//            System.out.println();
//        }
        /////right reverse triangle
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n;j++){
                System.out.print("*-");
            }
            System.out.println();
        }
    }
}
