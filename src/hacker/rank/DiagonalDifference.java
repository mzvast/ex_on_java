package hacker.rank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scale = in.nextInt(),counter = 0,
                sum1 = 0,counter1 = 0,
                sum2 = 0,counter2 = 0;
        while (counter<(scale*scale)){
            int current = in.nextInt();
//                System.out.println(current);
            if(counter%(scale+1) == 0&&counter1<scale) {
//                System.out.println("[left]");
                sum1+=current;
                counter1++;
            }
            if(counter%(scale-1) == 0&&counter!=0&&counter2<scale) {
//                System.out.println("[right]");
                sum2+=current;
                counter2++;
            }
            counter++;
        }
        in.close();
        System.out.println(Math.abs(sum1 - sum2));

    }

}
