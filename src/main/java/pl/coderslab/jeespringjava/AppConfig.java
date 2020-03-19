package pl.coderslab.jeespringjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.coderslab.jeespringjava.beans.*;

@Configuration
@ComponentScan("pl.coderslab.jeespringjava.beans")
public class AppConfig {

//    @Bean
//    public HelloWorld helloWorld() {
//        return new HelloWorld();
//    }
//
//    @Bean
//    public Capitan jackSparrow() {
//        return new Capitan();
//    }
//
//    @Bean
//    public Ship blackPearl() {
//        return new Ship(jackSparrow());
//    }
//
//    @Bean
//    @Scope("prototype")
//    public ScopePrototype scopePrototype() {
//        return new ScopePrototype();
//    }
//
//    @Bean
//    public ScopeSingleton scopeSingleton() {
//        return new ScopeSingleton();
//    }


}
