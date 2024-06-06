package Artists;

public class ArtistGeneral {
    private String artistName;
    private String musicGender;
    private String biography;
    private int totalOfPlays;
    private int discography;
    private String mostPlayedtraks;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getMusicGender() {
        return musicGender;
    }

    public void setMusicGender(String musicGender) {
        this.musicGender = musicGender;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public int gettotalOfPlays() {
        return totalOfPlays;
    }

    public void settotalOfPlays(int numberOfPlays) {
        this.totalOfPlays = numberOfPlays;
    }

    public int getDiscography() {
        return discography;
    }

    public void setDiscography(int discography) {
        this.discography = discography;
    }

    public String getMostPlayedtraks() {
        return mostPlayedtraks;
    }

    public void setMostPlayedtraks(String mostPlayedtraks) {
        this.mostPlayedtraks = mostPlayedtraks;
    }
}
