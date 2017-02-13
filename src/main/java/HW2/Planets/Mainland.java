package HW2.Planets;

import java.util.List;

/**
 * Created by vatva on 13.02.2017.
 */
public class Mainland {
    private String name;

    public Mainland setName(String name){
        this.name = name;
        return this;
    }

    public static int counterMainland(List<Mainland> mainlands){
        int counter = 0;
        for(Mainland mainland:mainlands) counter++;
        return counter;
    }

}
