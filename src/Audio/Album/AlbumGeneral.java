package Audio.Album;

import Audio.AudioGeneral;
import Interfaces.Description;

public class AlbumGeneral extends AudioGeneral implements Description {
    private String releaseDate;
    private int numberOftracks;
    private String artistName;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumberOftracks() {
        return numberOftracks;
    }

    public void setNumberOftracks(int numberOftracks) {
        this.numberOftracks = numberOftracks;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public void description() {
        System.out.println("Nome do álbum: " + getName());
        System.out.println("Nome do ártista: " + getArtistName());
        System.out.println("Total de faixas: " + getNumberOftracks());
        System.out.println("Duração: " + getDuration() + " minutos");
        System.out.println("Numero de vezes ouvido: " + getNumberOfPlays());
        System.out.println("Total de curtidas: " + getLikes());
        System.out.println("Data de lançamento: " + getReleaseDate());
        isUserFeedback();
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
