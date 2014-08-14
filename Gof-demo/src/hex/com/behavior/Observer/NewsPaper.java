package hex.com.behavior.Observer;

import java.util.LinkedList;

class NewsPaper {
  private LinkedList<Observer> observers;

  public NewsPaper() {
    observers = new LinkedList<Observer>();
  }

  public void subscribe(Observer o) {
    observers.add(o);
  }

  public void unsubscribe(Observer o) {
    observers.remove(o);
  }

  public void changeData(int data) {
    for (Observer o : observers) {
      o.update(data);
    }
  }
}
