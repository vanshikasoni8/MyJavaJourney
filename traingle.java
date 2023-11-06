package patterns;

import java.util.Scanner;

public class traingle {
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int col=1; col<=i;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        /////right side traingle
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                    System.out.print("8");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
