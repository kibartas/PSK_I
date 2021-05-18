package lt.vu.usecases;

import lt.vu.bookRecommendation.BookRecommendation;
import lt.vu.bookRecommendation.BookRecommendationComponent;
import lt.vu.entities.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@ApplicationScoped
@Named
public class GetBookRecommendation implements Serializable {

    @Inject
    private BookRecommendation bookRecommendationComponent;

    // To use @Specializes (RandomBookRecommendationComponent) uncomment this
    //@Inject
    //private BookRecommendationComponent bookRecommendationComponent;

    private CompletableFuture<String> bookRecommendationTask = null;

    public void getBookRecommendation() {
        bookRecommendationTask = bookRecommendationComponent.findBookRecommendation();
    }

    public boolean isRecommendationInProgress() {
        return bookRecommendationTask != null && !bookRecommendationTask.isDone();
    }

    public String getBookRecommendationResults() throws ExecutionException, InterruptedException {
        if (bookRecommendationTask == null) {
            return "No books are recommended for you";
        } else if (!bookRecommendationTask.isDone()) {
            return "Still searching...";
        }

        String title = bookRecommendationTask.get();
        bookRecommendationTask = null;
        return title;
    }


}
