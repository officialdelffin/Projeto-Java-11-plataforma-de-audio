/* Projeto :  Plataforma de Áudio

Simulador de áudio via terminal para consolidar POO em Java. Composto pela classe mãe Audio e subclasses Musica e Podcast. Utiliza uma interface com o metodo tocarSom e uma classe de serviço para execução,
aplicando conceitos de herança e polimorfismo para tratar objetos distintos de forma genérica e desacoplada. */


import br.com.officialdelffin.Audio.Music;

// Classe principal do sistema :
public class Main {


    // Funcção que faz a execução do sistema :
    public static void main( String[] args ) {


        // Intanciando um objeto musica :
        Music musicOne = new Music();


        // Passando dados das musicas :
        musicOne.setTittle   ( "Noiva cadaver" );
        musicOne.setAlbum    ( "Homem torto" );
        musicOne.setArtist   ( "Kamaitach" );
        musicOne.setDuration ( 1.42 );


        // Recado que está sendo reproduzida :
        System.out.println( musicOne.getTittle() + musicOne.playAudio() );


    }


}