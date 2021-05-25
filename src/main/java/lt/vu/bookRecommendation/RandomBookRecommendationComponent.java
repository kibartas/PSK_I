package lt.vu.bookRecommendation;

import lt.vu.entities.Book;
import lt.vu.persistence.BooksDAO;

import javax.ejb.Asynchronous;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@ApplicationScoped
@Specializes
@Alternative
public class RandomBookRecommendationComponent extends BookRecommendationComponent {

    private final List<String> books = new ArrayList<String>() {
        {
            add("Fun and more games");

            add("Another book");

            add("A book about stuff");
        }
    };


    @Override
    public CompletableFuture<String> findBookRecommendation() {
        Random rng = new Random();
        CompletableFuture<String> completableFuture = new CompletableFuture<String>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(4000);
            completableFuture.complete(books.get(rng.nextInt(books.size())));
            return null;
        });

        return completableFuture;
    }
}
