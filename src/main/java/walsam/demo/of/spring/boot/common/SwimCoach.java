package walsam.demo.of.spring.boot.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Across the pool 3 times as a warm up";
    }
}
