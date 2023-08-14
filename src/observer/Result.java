/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.ArrayList;

// 64050075

/**
 *
 * @author User
 */
public class Result implements Source {
    private final ArrayList<MyObserver> list;
    private String score;

    public Result() {
        this.list = new ArrayList<>();
    }
    public void setScore(String aData) {
	score = aData;
	notifyObservers();
    }
    public String  getScore() {
	return score;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
