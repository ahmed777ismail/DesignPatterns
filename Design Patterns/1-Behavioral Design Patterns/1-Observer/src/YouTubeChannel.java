import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }

    }
    public void uploadVideo(String videoTitle) {
        System.out.println("Channel uploaded: " + videoTitle);
        notifyObservers("New video uploaded: " + videoTitle);
    }
}