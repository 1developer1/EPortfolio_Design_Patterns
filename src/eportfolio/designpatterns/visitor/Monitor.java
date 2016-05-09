package eportfolio.designpatterns.visitor;

/**
 * Created by Mario on 09.05.2016.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}