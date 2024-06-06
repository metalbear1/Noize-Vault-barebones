package UserProfile;

public class User {
    private String userName;
    private String favoriteArtists;
    private double timeSpent;
    private double timeSpentPodcast;
    private int numberAlbuns;
    private int numberArtist;
    private int numberPodcasts;

//    Getters e Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFavoriteArtists() {
        return favoriteArtists;
    }

    public void setFavoriteArtists(String favoriteArtists) {
        this.favoriteArtists = favoriteArtists;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    public double getTimeSpentPodcast() {
        return timeSpentPodcast;
    }

    public void setTimeSpentPodcast(double timeSpentPodcast) {
        this.timeSpentPodcast = timeSpentPodcast;
    }

    public int getNumberAlbuns() {
        return numberAlbuns;
    }

    public void setNumberAlbuns(int numberAlbuns) {
        this.numberAlbuns = numberAlbuns;
    }

    public int getNumberArtist() {
        return numberArtist;
    }

    public void setNumberArtist(int numberArtist) {
        this.numberArtist = numberArtist;
    }

    public int getNumberPodcasts() {
        return numberPodcasts;
    }

    public void setNumberPodcasts(int numberPodcasts) {
        this.numberPodcasts = numberPodcasts;
    }

//    Métodos

    public void profileExibit() {
        System.out.println("Nome do usuário: " + userName);
        System.out.println("Artistas mais ouvidos: " + favoriteArtists);
        System.out.println("Tempo total de músicas ouvidas: " + timeSpent/60 + " horas");
        System.out.println("Tempo total de podcasts ouvidos: " + timeSpentPodcast/60 + " horas");
        System.out.println("Número de álbuns seguidos: " + numberAlbuns);
        System.out.println("Total de artistas seguidos: " + numberArtist);
        System.out.println("Total de podccasts seguidos: " + numberPodcasts);
    }

}