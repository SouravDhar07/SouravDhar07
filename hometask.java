package com.company;
import java.util.Scanner;
public class hometask {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int A=a.nextInt();
        int B=b.nextInt();
        int C=c.nextInt();
        if(A>B && A>C){
            System.out.println("A is greatest");
        }
        else if(B>A && B>C){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }

    }
}
