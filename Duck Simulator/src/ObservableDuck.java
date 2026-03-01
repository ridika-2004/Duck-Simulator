import java.util.ArrayList;
import java.util.List;

public class ObservableDuck implements Quackable, QuackObservable {
    private Quackable duck;
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public ObservableDuck(Quackable duck, String name) {
        this.duck = duck;
        this.name = name;
    }

    public void quack() {
        duck.quack();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(name);
        }
    }
}
