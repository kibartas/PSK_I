package lt.vu.bookRecommendation;

import lt.vu.entities.Book;

import javax.persistence.Query;
import java.util.concurrent.CompletableFuture;

public interface BookRecommendation {
    CompletableFuture<String> findBookRecommendation();
}
