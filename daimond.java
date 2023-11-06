package patterns;

import java.util.Scanner;

public class daimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //////////up hill//////
        for(int row=1; row<=n;row++){
            for(int col= n; col>=1; col--){
//                System.out.print("8");
                if(row>=col){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int i=1;i<=n;i++){
                for(int j =);
            }
            System.out.println();

        }

    }
}
