/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

// 64050075

/**
 *
 * @author User
 */
public class user1 implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println("live result : " + ((Result)o).getScore());
    }
}
