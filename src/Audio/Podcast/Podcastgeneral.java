package Audio.Podcast;

import Audio.AudioGeneral;
import Interfaces.Description;

public class Podcastgeneral extends AudioGeneral implements Description {
    private String description;
    private int actualEpisode;
    private int pastEpisodes;

    public int getActualEpisode() {
        return actualEpisode;
    }

    public void setActualEpisode(int actualEpisode) {
        this.actualEpisode = actualEpisode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPastEpisodes() {
        return pastEpisodes;
    }

    public void setPastEpisodes(int pastEpisodes) {
        this.pastEpisodes = pastEpisodes;
    }

    @Override
    public void description() {
        System.out.println("Kyoto Robato apresenta: " + getName());
        System.out.println("Este é o episódio de número: " + getActualEpisode());
        System.out.println(getDescription());
        System.out.println("Aproveite e ouça os outros " + getPastEpisodes() + " capitulos anteriores.");
        System.out.println("Duração de : " + getDuration() + " minutos.");
        System.out.println("Total de likes: " + getLikes());
        System.out.println("Este capitulo já foi ouvido: " + getNumberOfPlays());
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
            System.out.println("Obrigado, iremos continuar a recomendar Podcasts como este para você");
        }
        else {
            System.out.println("Obrigado, não recomendaremos mais este tema de Podcast para você");
        }
        return userLikedIt;
    }
}
