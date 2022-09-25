package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
public class WebHtmlContent {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://info.cegepmontpetit.ca/3N5-Prog3/z/").get();
        Element link = doc.select("a").first();
        String relHref = link.attr("href"); // == "/"
        String absHref = link.attr("abs:href"); // "http://jsoup.org/"
        System.out.println(doc.html());


    }
}
