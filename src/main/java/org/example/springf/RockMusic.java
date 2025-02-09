package org.example.springf;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {
    private List<String> listRock = new ArrayList<>();

    {
        listRock.add("King and Jester");
        listRock.add("The Beatles");
        listRock.add("Queen");
    }

    @Override
    public List<String> getSong() {
        return listRock;
    }

//    private RockMusic() {
//    }
//
//    public static RockMusic factory() {
//        return new RockMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }


}
