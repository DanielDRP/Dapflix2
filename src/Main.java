import Data.Movie;
import Observable.Max;
import Observable.StreamingService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamingService n = new Max();
        List<Movie> l = n.fetchMovies();
        for(Movie data : l){
            System.out.println(data.getTitulo());
        }
    }
}