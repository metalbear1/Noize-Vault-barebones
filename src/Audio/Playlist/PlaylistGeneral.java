package Audio.Playlist;

import Audio.AudioGeneral;
import Interfaces.Description;

public class PlaylistGeneral extends AudioGeneral implements Description {
    private int totalTracks;
    private int totalOfArtists;

    public int getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
    }

    public int getTotalOfArtists() {
        return totalOfArtists;
    }

    public void setTotalOfArtists(int totalOfArtists) {
        this.totalOfArtists = totalOfArtists;
    }


    @Override
    public void description() {
        System.out.println("Nome da Playlist: " + getName());
        System.out.println("Tempo total de música: " + getDuration() + " minutos");
        System.out.println("Total de artistas que colaboram nesta Playlist: "+ getTotalOfArtists());
        System.out.println("Número total de faixas na Playlist: " + getTotalTracks());
        System.out.println("Número de curtidas: " + getLikes());
        System.out.println("Número de vezes que foi ouvida: " + getNumberOfPlays());
    }

    @Override
    public int getNumberOfLikes() {
        return getLikes();
    }

    @Override
    public boolean LikedIt() {
        boolean userLikedIt = isUserFeedback();

        if (userLikedIt == true) {
            System.out.println("Obrigado, já que gostou tanto, que tal ouvir...");
        }
        else {
            System.out.println("Obrigado, não indicaremos mais esse estilo para você");
        }
        return userLikedIt;
    }
}
