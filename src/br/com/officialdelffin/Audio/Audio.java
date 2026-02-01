
// Pacotes :
package br.com.officialdelffin.Audio;


import br.com.officialdelffin.Interfaces.Playable;

// Classe abstrata para os tipos de aúdio :
abstract public class Audio {


    // Artibutos :

    private String tittle       = "";
    private int duration        = 0;
    private int totalPlayback   = 0;
    private int likes           = 0;
    private int classification  = 0;


    // Metodos :


    // Permite curtir
    public void enjoy () {




    }


    // Permite reproduzir :
    public void play () {





    }


    // Metodos Getters e Setters :


    // Getters :

    public String getTittle() {


        return tittle;


    }


    public int getDuration() {


        return duration;


    }


    public int getTotalPlayback() {


        return totalPlayback;


    }


    public int getLikes() {


        return likes;


    }


    public int getClassification() {


        return classification;


    }


    // Setters :

    public void setTittle( String tittle ) {


        this.tittle = tittle;


    }


    public void setDuration( int duration ) {


        this.duration = duration;


    }


    public void setTotalPlayback( int totalPlayback ) {


        this.totalPlayback = totalPlayback;


    }


    public void setLikes( int likes ) {


        this.likes = likes;


    }


    public void setClassification( int classification ) {


        this.classification = classification;


    }


}
