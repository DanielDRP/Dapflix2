package Observable;

import Data.Movie;
import Observer.Observer;

import java.util.List;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    List<Movie> fetchMovies();
    void startAutoReload(int intervalMinutes);
    void stopAutoReload();
    boolean isUpdated(List<Movie> newMovies);
}
