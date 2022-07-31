package com.deloitte.learnspring;

import com.deloitte.learnspring.game.GameRunner;
import com.deloitte.learnspring.game.Warframe;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

    public static void main(String[] args) {

//        SpringApplication.run(LearnSpringApplication.class, args);

//        Minecraft mc = new Minecraft();
        Warframe wf = new Warframe();

        GameRunner runner = new GameRunner(wf);

        runner.runGame();
    }

}
