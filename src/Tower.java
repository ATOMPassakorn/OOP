/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATOMPassakorn
 */
import java.util.*;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the tower: ");
        int height = sc.nextInt();
        for (int i=1; i<=height; i++){
            System.out.println("#-#-#-#-#");
        }
    }
}
