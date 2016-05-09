package eportfolio.designpatterns.visitor;

/**
 * Created by Mario on 09.05.2016.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}