/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scnr.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++){
            sum += i;        
        }
        System.out.println("The sum of 1 to " + n + " is: " + sum + ".");
    }
}
