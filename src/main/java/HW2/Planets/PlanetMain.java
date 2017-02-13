package HW2.Planets;

/**
 * Created by vatva on 13.02.2017.
 */
public class PlanetMain {
    public static void main(String[] args) {

        String mainland = CreaterObjects.createrMailand().toString();
        String island = CreaterObjects.createrIsland().toString();
        String ocean = CreaterObjects.createOceans().toString();

        System.out.println(Planet.createrPlanet("Earth",mainland,ocean,island));

        int countMainland = Mainland.counterMainland(CreaterObjects.createrMailand());
        System.out.println("Planet has "+countMainland + " mainland.");
    }

}
