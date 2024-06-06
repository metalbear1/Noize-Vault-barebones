package Audio;

public class AudioGeneral {
    private String name;
    private double duration;
    private int numberOfPlays;
    private int likes;
    private boolean userFeedback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public void setNumberOfPlays(int numberOfPlays) {
        this.numberOfPlays = numberOfPlays;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(boolean userFeedback) {
        this.userFeedback = userFeedback;
    }
}
