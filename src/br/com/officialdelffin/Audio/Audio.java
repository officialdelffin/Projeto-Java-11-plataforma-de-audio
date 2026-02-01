
// Pacotes :
package br.com.officialdelffin.Audio;


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


    // Reprodução de audio :
    public void playAudio () {





    }


    // Metodos Getters e Setters :


    public String getTittle() {


        return tittle;


    }


    public void setTittle( String tittle ) {


        this.tittle = tittle;


    }


    public int getDuration() {


        return duration;


    }


    public void setDuration( int duration ) {


        this.duration = duration;


    }


    public int getTotalPlayback() {


        return totalPlayback;


    }


    public void setTotalPlayback( int totalPlayback ) {


        this.totalPlayback = totalPlayback;


    }


    public int getLikes() {


        return likes;


    }


    public void setLikes( int likes ) {


        this.likes = likes;


    }


    public int getClassification() {


        return classification;


    }


    public void setClassification( int classification ) {


        this.classification = classification;


    }
}
