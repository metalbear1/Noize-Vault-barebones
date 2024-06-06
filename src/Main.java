import Audio.Album.AlbumGeneral;
import Audio.Playlist.PlaylistGeneral;
import Audio.Podcast.Podcastgeneral;
import Audio.Track.TrackGeneral;
import Interfaces.Classification;
import UserProfile.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá bem vindo ao Noize Vault, seu app numero 1 de streaming sonoro!");
        Classification note = new Classification();

//Perfil de usuário
        User metalBear = new User();
        metalBear.setUserName("MetalBear");
        metalBear.setFavoriteArtists("RZA, MASTERBOOT RECORD, CASSIOPEIA, MAacroblank, Opel Vessel...");
        metalBear.setNumberArtist(48);
        metalBear.setNumberAlbuns(87);
        metalBear.setNumberPodcasts(87);
        metalBear.setTimeSpent(35880);
        metalBear.setTimeSpentPodcast(26400);
        metalBear.profileExibit();

        System.out.println();

//Indicação de Playlist
        System.out.println("De acordo com o que você anda ouvindo, pode gostar dessa Playlist");
        PlaylistGeneral letItDie = new PlaylistGeneral();
        letItDie.setName("Let It Die OST");
        letItDie.setTotalTracks(33);
        letItDie.setTotalOfArtists(33);
        letItDie.setDuration(124.3);
        letItDie.setNumberOfPlays(579);
        letItDie.setLikes(666);
        letItDie.setUserFeedback(true);
        letItDie.description();
        note.thermometer(letItDie);

        System.out.println();
//Indicação de álbum e suas informações
        System.out.println("O último álbum que você ouviu no volume máximo foi: ");
        AlbumGeneral church = new AlbumGeneral();
        church.setName("Nel Nome Del Codice");
        church.setArtistName("Keygen Church");
        church.setNumberOftracks(9);
        church.setDuration(54);
        church.setNumberOfPlays(35415);
        church.setLikes(2350);
        church.setReleaseDate("20 de Março de 2024");
        church.setUserFeedback(true);
        church.description();
        church.getNumberOfLikes();
        church.LikedIt();
        note.thermometer(church);

        System.out.println();

//Último podcast ouvido
        System.out.println("Seus podcasts estão ficando com saudade já, o último que você ouviu foi: ");
        Podcastgeneral terror = new Podcastgeneral();
        terror.setName("Matsuzo Ohama: O incidente do som do Piano");
        terror.setDescription("""
                Neste último capitulo, Kyoto Robato examina a fundo o caso de 
                Matsuzo Ohama e o assassinato da família Okamura.""");
        terror.setActualEpisode(15);
        terror.setPastEpisodes(14);
        terror.setDuration(51.45);
        terror.setNumberOfPlays(100000);
        terror.setLikes(53000);
        terror.setUserFeedback(false);
        terror.description();
        terror.LikedIt();
        note.thermometer(terror);

        System.out.println();

//Faixa que está sendo tocada
        System.out.println("Tocando agora: ");
        TrackGeneral opel = new TrackGeneral();
        opel.setName("あなたのためのすべて");
        opel.setArtistName("Opel Vessel");
        opel.setFromAlbum("腐敗した死体");
        opel.setDuration(8.44);
        opel.setNumberOfPlays(378000);
        opel.setLikes(15000);
        opel.setAlbumTrack("3");
        opel.setUserFeedback(true);
        opel.description();
        note.thermometer(opel);
    }
}