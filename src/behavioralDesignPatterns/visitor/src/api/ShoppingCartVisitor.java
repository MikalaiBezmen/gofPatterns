package behavioralDesignPatterns.visitor.src.api;

import behavioralDesignPatterns.visitor.src.impl.Book;
import behavioralDesignPatterns.visitor.src.impl.Fruit;

/**
 * ShoppingCartVisitor.
 *
 * @author Mikalai Bezmen
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
