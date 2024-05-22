classDiagram
    class ReprodutorMusical {
        +selecionarArtista(String artista)
        +selecionarAlbum(String album)
        +selecionarMusica(String musica)
        +tocar()
        +pausar()
        +volume(int volume)
        +notaAlbum(int nota)
    }

    class AparelhoTelefonico {
        +selecionarContato(String contato)
        +adicionarContatoFavoritos(String contato)
        +discarNumero(String numero)
        +fazerChamada()
        +receberChamada()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +novaAba()
        +trocarAba()
        +atualizarPagina()
    }

    class iPhone {
    } 
    
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet