package task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/*
        Napisz program, który wykorzysta API Kanye Rest https://kanye.rest/ by
        każdorazowo zaproponować nową perełkę mądrości od Kanye Westa.
        Program powinien być obsługiwany z poziomu konsoli i obsługiwać komendę "next"
        by wywołać następny cytat. Program nie potrzebuje oprawy graficznej.
        Zwróć uwagę na poprawną architekturę aplikacji oraz na czystość kodu.
        Dla chętnych, za dodatkowe punkty: dodaj zapisywanie cytatów w pamięci,
        by upewnić się, że każdy kolejny cytat jest nowy.
 */
public class Task3 {
    private static Document page() throws IOException{
        String url = "https://kanye.rest/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    public static void main(String[] args) {

//        {
//            document = Jsoup.parse("https://kanye.rest/");
//
//            Elements elements = document.select("div.container svelte-1fuw5ea");
////                Elements elements = document.getElementsByTag("div.footer");
//            System.out.println(elements.text());
//            for (Element element : elements){
//                System.out.println(element.text());
//            }

//        }
        try {
            Document document =page();
            Element e = document.body();
            System.out.println(e.text());
            System.out.println(page());
        }catch (IOException e){
            e.getMessage();
        }
        /*
        Wiecej nie wyszlo
         */

    }
}
