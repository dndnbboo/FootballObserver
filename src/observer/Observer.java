/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;
import java.util.Scanner;

// 64050075

/**
 *
 * @author User
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Result re=new Result();
        user1 u1=new user1();
        user2 u2=new user2();
        
        re.register(u1);
        re.register(u2);
        
        String input="score";
        while (input != "") {
            System.out.print("Enter score : ");
            input = in.nextLine();
            if (input != "") {
                re.setScore(input);
            } else {
                System.out.println("End");
            }
        }
    }
}
