 package org.scrapping;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
 public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.jumia.com.ng/phones-tablets/";
        Document page = Jsoup.connect(url).get();
        Elements elementsContainer = page.getElementsByClass("itm col");

        List<Product> products = new LinkedList<>();

        elementsContainer.forEach(element -> {
            final String name = element.getElementsByClass("name").text();
            final String prc = element.getElementsByClass("prc").attr("data-oprc");

            products.add(new Product(name,prc));
        });

        System.out.println(products);
    }
    
}
