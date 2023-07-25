package com.cg;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arm=s.nextInt();
        int temp=arm;
        int sum = 0;
        while(temp>0){
            int dif=temp%10;
            sum = sum+dif*dif*dif;
            temp/=10;
        }
        if(arm==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}