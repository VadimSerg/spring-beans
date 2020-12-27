package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class AnimalsCage {
    private Animal animal;
    private Timer timer;

    @Autowired
    AnimalsCage (@Qualifier("dogBean") Animal animal,Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }


    @Qualifier("timerBean")
    public Timer getTimer() {

        return timer;

    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
       // System.out.println(new Timer().getTime());
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }

}
