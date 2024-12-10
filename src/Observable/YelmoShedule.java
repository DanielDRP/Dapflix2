package Observable;

import Data.Movie;
import Data.WebScraping.MovieScrapper;
import Observer.Observer;

import java.util.List;

public class YelmoShedule implements Observable, MovieShedule{

    private List<Observer> observers;
    final String baseUrl = "https://www.yelmocines.es/cartelera/";
    String city;
    MovieScrapper yelmo;

    public YelmoShedule(){
        this("santa-cruz-tenerife");
    }

    public YelmoShedule(String city){
        this.city = city;
        yelmo = new MovieScrapper("/Users/dani/Documents/Uni/DAP/Libraries/chromedriver-mac-x64/chromedriver",baseUrl);
    }

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
        return yelmo.getSchedule(city);
    }
}
