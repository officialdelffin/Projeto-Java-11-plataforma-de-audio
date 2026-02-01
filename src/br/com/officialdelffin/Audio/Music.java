
// Pacotes :
package br.com.officialdelffin.Audio;


import br.com.officialdelffin.Interfaces.Playable;

// Classe filha musica :
public class Music extends Audio implements Playable {



    @Override
    public String getPlaying (){


        String audioPlaybackDisplay = "A musica está sendo reproduzida";

        return audioPlaybackDisplay;


    }



}
