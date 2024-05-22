package Aparelho;

import AparelhoTelefonico.TelefoneApp;
import NavegadorInternet.SafariApp;
import ReprodutorMusical.MusicPlayerApp;

public class iPhone {
    private MusicPlayerApp reprodutorMusical;
    private SafariApp navegadorInternet;
    private TelefoneApp aparelhoTelefonico;

    public iPhone() {
        this.reprodutorMusical = new MusicPlayerApp();
        this.aparelhoTelefonico = new TelefoneApp();
        this.navegadorInternet = new SafariApp();
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.selecionarArtista("The Beatles");
        reprodutorMusical.selecionarAlbum("Abbey Road");
        reprodutorMusical.selecionarMusica("Here comes the sun");
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();

    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina("DIO.me");
        navegadorInternet.novaAba();
        navegadorInternet.trocarAba();
        navegadorInternet.atualizarPagina();
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.selecionarContato("Tarcisio Damascena");
        aparelhoTelefonico.adicionarContatoFavoritos("Tarcisio Damascena");
        aparelhoTelefonico.discarNumero("1029312038");
        aparelhoTelefonico.fazerChamada();
        aparelhoTelefonico.receberChamada();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.usarReprodutorMusical();
        meuiPhone.usarAparelhoTelefonico();
        meuiPhone.usarNavegadorInternet();
    }
}
