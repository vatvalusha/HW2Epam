package HW2.Planets;

/**
 * Created by vatva on 13.02.2017.
 */
public class Planet {
    private Mainland mainland;
    private Ocean ocean;
    private Island island;
    private String name;

    public Planet( String name, Mainland mainland, Ocean ocean, Island island){
        this.mainland = mainland;
        this.ocean = ocean;
        this.island = island;
        this.name = name;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }

    public Ocean getOcean() {
        return ocean;
    }

    public void setOcean(Ocean ocean) {
        this.ocean = ocean;
    }

    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "mainland=" + mainland +
                ", ocean=" + ocean +
                ", island=" + island +
                ", name='" + name + '\'' +
                '}';
    }

    public static Planet createrPlanet(String name, String mainland,String ocean, String island){
        return new Planet(name,new Mainland().setName(mainland),new Ocean().setName(ocean),new Island().setName(island));
    }
}
