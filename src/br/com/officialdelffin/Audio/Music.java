
// Pacotes :
package br.com.officialdelffin.Audio;


import br.com.officialdelffin.Interfaces.Playable;

// Classe filha musica :
public class Music extends Audio implements Playable{


    // Atributos :

    String album  = "";
    String artist = "";
    String genre  = "";


    // Metodos Getters e Setters :

    // Getters:

    public String getAlbum() {


        return album;


    }


    public String getArtist() {


        return artist;


    }


    public String getGenre() {


        return genre;


    }


    // Setters :

    public void setAlbum( String album ) {


        this.album = album;


    }


    public void setArtist( String artist ) {


        this.artist = artist;


    }


    public void setGenre( String genre ) {


        this.genre = genre;


    }


    // Metodos :

    // Sobreescrevendo o metodo playAudio :
    @Override
    public String playAudio() {


        return "A musica está sendo reproduzida!";


    }




}
