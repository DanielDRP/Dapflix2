package Observable;

import Data.Movie;
import Data.TMDBApi.TMDBApi;
import Observer.Observer;

import java.util.List;

public class DisneyPlus implements Observable, StreamingService{

    private List<Observer> observers;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) o.notify();
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public List<Movie> fetchMovies() {
        System.out.println("Cambiar el codigo de disney");
        return TMDBApi.fetchMovies("No se cual es :D");
    }
}
