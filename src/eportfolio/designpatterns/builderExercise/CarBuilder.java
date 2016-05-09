package eportfolio.designpatterns.builderExercise;

/**
 * Created by Mario on 09.05.2016.
 */
public interface CarBuilder {

    public void buildBodyStyle();
    public void buildPower();
    public void buildEngine();
    public void buildBreaks();
    public void buildSeats();
    public void buildWindows();
    public void buildFuelType();
    public Car getCar();
}
