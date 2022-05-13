package at.campus02.iwi;

public class OrderApp {
    public static void main(String[] args) {
        Order od = new Order(4);

        for(int i = 0; i < 14; ++i)
        {
            od.addArticle(new Article("house", 1, i));
            System.out.println(od);
        }
        od.removeArticle(12);
        System.out.println(od);
    }
}
