import Observable.*;
import Observer.User;


public class Main {
    public static void main(String[] args) {
        Observable max = new Max();
        Observable netflix = new Netflix();
        Observable yelmo = new YelmoShedule();
        User u = new User("Dani");
        yelmo.registerObserver(u);
        max.registerObserver(u);
        netflix.registerObserver(u);

        max.startAutoReload(1);
        netflix.startAutoReload(1);
        yelmo.startAutoReload(1);
    }
}