package eportfolio.designpatterns.visitor;

/**
 * Created by Mario on 09.05.2016.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}