package Interfaces;

public class Classification {

    public void thermometer(Description likes) {
        if(likes.getNumberOfLikes() >= 20000) {
            System.out.println("Favorito do momento!");
        }
        else if(likes.getNumberOfLikes() >= 1000) {
            System.out.println("Não sai do ouvido da galera");
        }
        else {
            System.out.println("Raramente procurada");
        }
    }
}
