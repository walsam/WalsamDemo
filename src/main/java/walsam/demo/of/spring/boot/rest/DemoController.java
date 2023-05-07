package walsam.demo.of.spring.boot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import walsam.demo.of.spring.boot.common.Coach;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("tennisCoach") Coach theCoach,
            @Qualifier("tennisCoach") Coach theAnotherCoach
    ){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    /*@Autowired
    public void setCoach(@Qualifier("trackCoach") Coach theCoach) {
        myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}