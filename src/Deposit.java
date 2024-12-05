/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATOMPassakorn
 */
import java.util.*;
public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        int money = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        if (type=='A'||type=='C'){
            System.out.print("Your total money in one year = ");
            System.out.println((int) (money * 1.015));
        } else if (type=='B'){
            System.out.print("Your total money in one year = ");
            System.out.println((int) (money * 1.02));
        } else if (type=='X'){
            System.out.print("Your total money in one year = ");
            System.out.println((int) (money * 1.05));
        }
    }
}
