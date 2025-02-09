package org.example.springf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringFApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
        //   RockMusic rockMusic = context.getBean("jazzMusic", RockMusic.class);
        //    RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        //    System.out.println(rockMusic.getSong());
        //   System.out.println(rockMusic1.getSong());
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.musicPlayer(ListMusic.JazzMusic);
        musicPlayer.musicPlayer(ListMusic.RockMusic);
        System.out.println(musicPlayer.getVolume());
//        Music music = new RockMusic();
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

    }
}
