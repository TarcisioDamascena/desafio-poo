package ReprodutorMusical;

public class MusicPlayerApp {
    public String selecionarArtista(String artista){
        artista = "Artista selecionada: ";
        return artista;
    }
    public String selecionarAlbum(String album){
        album = "Album selecionada: ";
        return album;
    }
    public String selecionarMusica(String musica){
        musica = "musica selecionada: ";
        return musica;
    }
    public int volume(int volume){
        volume = 10;
        return volume;
    }
    public int notaAlbum(int nota){
        nota = 5;
        return nota;
    }

    public void tocarMusica(){
        System.out.println("Tocando musica: ");
    }
    public void pausarMusica(){
        System.out.println("Musica parada!");
    }

}
