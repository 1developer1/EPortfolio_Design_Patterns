package eportfolio.designpatterns.visitor;

/**
 * Created by Mario on 09.05.2016.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}