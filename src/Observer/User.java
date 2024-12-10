package Observer;

import Data.Movie;

import java.util.List;

public class User implements Observer{

    String name;


    public User(String name){
        this.name = name;
    }

    @Override
    public void update(List<Movie> message) {
        System.out.println(message); //Llamar a la ui
    }

    @Override
    public String getId() {
        return name;
    }
}
