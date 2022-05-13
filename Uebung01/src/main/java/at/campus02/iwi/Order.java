package at.campus02.iwi;

import java.util.Arrays;

public class Order {

    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder){
        nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    public void addArticle(Article a){
        if(nrArticles >= capacityOrder){
            increaseArray();
        }
        articles[nrArticles++] = a;

    }
    public void removeArticle(int nr){
        if(nr > 0 && nr <= nrArticles){

            for(int i = nr - 1; i < nrArticles - 1; ++i)
            {
                articles[i] = articles[i + 1];
            }
            articles[nrArticles - 1] = null;
            --nrArticles;
        }
    }
    private void increaseArray(){
        System.out.printf("capacity increased");
        Article[] newArt = new Article[capacityOrder + 10];

        for(int i = 0; i < nrArticles; ++i)
        {
            newArt[i] = articles[i];
        }

        articles = newArt;
        capacityOrder = capacityOrder + 10;
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }
}
