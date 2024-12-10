package Observer;

import Data.Movie;

import javax.swing.*;
import java.util.List;
import UI.StreamingGUI;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Movie> movies) {
        System.out.println("UPDATE"); // Esto debe imprimirse en la consola
        System.out.println("Recibidas nuevas películas para " + name + ": " + movies);

        // Verificar que el código se ejecute en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(() -> {
            try {
                System.out.println("Hilo dentro de invokeLater: " + Thread.currentThread().getName());
                StreamingGUI.updateMoviesForUser(name, movies);
            } catch (Exception e) {
                e.printStackTrace(); // Imprime cualquier excepción que pueda estar ocurriendo
            }
        });

    }



    @Override
    public String getId() {
        return name;
    }
}
