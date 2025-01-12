package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "dog")
    public Dog dog() {
        Dog dog = new Dog();
        return dog;
    }

    @Bean(name = "cat")
    public Cat cat() {
        Cat cat = new Cat();
        return cat;
    }

    @Bean(name = "timer")
    public Timer timer() {
        Timer timer = new Timer();
        return timer;
    }

}
