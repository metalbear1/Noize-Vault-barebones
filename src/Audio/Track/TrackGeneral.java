package Audio.Track;

import Audio.AudioGeneral;
import Interfaces.Description;
import com.sun.tools.javac.Main;

public class TrackGeneral extends AudioGeneral implements Description {
    private String albumTrack;
    private String artistName;
    private String fromAlbum;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getFromAlbum() {
        return fromAlbum;
    }

    public void setFromAlbum(String fromAlbum) {
        this.fromAlbum = fromAlbum;
    }

    public String getAlbumTrack() {
        return albumTrack;
    }

    public void setAlbumTrack(String albumTrack) {
        this.albumTrack = albumTrack;
    }


    @Override
    public void description() {
        System.out.println("Nome da música: " + getName());
        System.out.println("Nome do artista: " + getArtistName());
        System.out.println("Album: " + getFromAlbum());
        System.out.println("Duração: " + getDuration() + " minutos");
        System.out.println("Numero de vezes ouvida: " + getNumberOfPlays());
        System.out.println("Número de curtidas: " + getLikes());
        System.out.println("Faixa de número: " + getAlbumTrack());
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
            System.out.println("Obrigado, não indicaremos mais esse estilo musical para você");
        }
        return userLikedIt;
    }
}