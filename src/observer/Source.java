/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

// 64050075

/**
 *
 * @author User
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}
