package Observer;

public class User implements Observer{

    String name;

    @Override
    public void update(String message) {
        this.name = message;
    }

    public String getName() {
        return name;
    }
}
