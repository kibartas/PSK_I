package lt.vu.bookRecommendation;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@ApplicationScoped
public class BookRecommendationComponent implements Serializable, BookRecommendation {

    private final List<String> books = new ArrayList<String>() {
        {
            add("Fun and more games");

            add("Another book");

            add("A book about stuff");
        }
    };

    public CompletableFuture<String> findBookRecommendation() {
        CompletableFuture<String> completableFuture = new CompletableFuture<String>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(4000);
            completableFuture.complete(books.get(0));
            return null;
        });

        return completableFuture;

    }
}
