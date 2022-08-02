package com.deloitte.learnspring;

import com.deloitte.learnspring.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan("com.deloitte.learnspring")
public class LearnSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);

        GameRunner runner = context.getBean(GameRunner.class);

////        Minecraft mc = new Minecraft();
//        Warframe wf = new Warframe();
//        GameRunner runner = new GameRunner(wf);

        runner.runGame();
    }

}
