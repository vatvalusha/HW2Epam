package HW2.Planets;

/**
 * Created by vatva on 13.02.2017.
 */

public class Ocean {

    private String name;

    public Ocean setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                '}';
    }
}
