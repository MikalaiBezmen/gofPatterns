package behavioralDesignPatterns.visitor.src.api;

/**
 * ItemElement.
 *
 * @author Mikalai Bezmen
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
