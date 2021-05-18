package src;

import java.util.Arrays;

public class Newsfeed {

    String[] favoriteArticles;

    public Newsfeed() {
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(sampleFeed.favoriteArticles.length);

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
