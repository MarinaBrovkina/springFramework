package org.example.springf;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusic implements Music {

    private List<String> listJazz = new ArrayList<>();

    {
        listJazz.add("Louis Armstrong");
        listJazz.add("Ella Fitzgerald");
        listJazz.add("Frank Sinatra");
    }

    @Override
    public List<String> getSong() {
        return listJazz;
    }

//    private JazzMusic() {
//    }
//
//    public static JazzMusic factory() {
//        return new JazzMusic();
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
