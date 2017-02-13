package HW2.Planets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vatva on 13.02.2017.
 */
public class CreaterObjects {

    public static List<Island> createrIsland(){
        List<Island> islands = new ArrayList<Island>();
        islands.add(new Island().setName("Ambergris"));
        islands.add(new Island().setName("Bora Bora"));
        islands.add(new Island().setName("San Juan"));
        islands.add(new Island().setName("Santorini"));
        return islands;
    }

    public static List<Mainland> createrMailand(){
        List<Mainland> mainlands = new ArrayList<Mainland>();
        mainlands.add(new Mainland().setName("Eurasia"));
        mainlands.add(new Mainland().setName("Africa"));
        mainlands.add(new Mainland().setName("Australia"));
        mainlands.add(new Mainland().setName("North America"));
        mainlands.add(new Mainland().setName("South America"));
        mainlands.add(new Mainland().setName("Antarctica"));

        return mainlands;
    }

    public static List<Ocean> createOceans (){
        List<Ocean> oceans = new ArrayList<Ocean>();
        oceans.add(new Ocean().setName("Pacific ocean"));
        oceans.add(new Ocean().setName("Atlantic ocean"));
        oceans.add(new Ocean().setName("Arctic ocean"));
        oceans.add(new Ocean().setName("Indian ocean"));
        oceans.add(new Ocean().setName("Southern ocean"));

        return oceans;
    }
}
