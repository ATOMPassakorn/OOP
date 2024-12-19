/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATOMPassakorn
 */
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int even = 0,odd = 0;
        do{
            num = sc.nextInt();
            if (num!=-1){
                if (num%2==0){
                even++;
            } else{
                odd++;
            }
            }
        }while (num!=-1);
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
