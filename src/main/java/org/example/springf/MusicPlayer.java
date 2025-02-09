package org.example.springf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.volume}")
    private int volume;

    private JazzMusic jazzMusic;
    public RockMusic rockMusic;

  //  @Autowired
    public MusicPlayer(JazzMusic jazzMusic, RockMusic rockMusic) {
        this.jazzMusic = jazzMusic;
        this.rockMusic = rockMusic;
    }

    public int getVolume() {
        return volume;
    }

    public void musicPlayer(ListMusic list) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (list == ListMusic.RockMusic) {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
        if (list == ListMusic.JazzMusic) {
            System.out.println(jazzMusic.getSong().get(randomNumber));
        }
    }

//    private Music music1;
//    private Music music2;
//
//    @Autowired
//    public MusicPlayer(@Qualifier("jazzMusic") Music music1, @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

//    private JazzMusic jazzMusic;
//
//    @Autowired
//    public MusicPlayer(JazzMusic jazzMusic) {
//        this.jazzMusic = jazzMusic;
//    }

//    public MusicPlayer() {
//    }

//    @Autowired
//@Qualifier("jazzMusic")
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void setJazzMusic(JazzMusic jazzMusic) {
//        this.jazzMusic = jazzMusic;
//    }


}
