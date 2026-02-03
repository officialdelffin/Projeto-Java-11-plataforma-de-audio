
// Pacotes :
package br.com.officialdelffin.Audio;


import br.com.officialdelffin.Interfaces.Playable;

// Classe filha Podcast :
public class Podcast extends  Audio implements Playable {


    // Atributos :

    String host       = "";
    String descrition = "";


    // Metodos Getters e Setters :

    // Getters :


    public String getHost (){


        return host;


    }


    public String getDescrition () {


        return descrition;


    }


    // Setters :

    public void setHost ( String host ) {


        this.host = host;


    }


    public void setDescrition ( String descrition ) {


        this.descrition = descrition;


    }


    // Metodos :

    // Sobreescrevendo o metodo playAudio :
    @Override
    public String playAudio (){


        return " está sendo reproduzido como Podcast!";


    }



}
