package pl.coderslab.jeespringjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.jeespringjava.beans.PersonService;
import pl.coderslab.jeespringjava.beans.ScopePrototype;
import pl.coderslab.jeespringjava.beans.ScopeSingleton;
import pl.coderslab.jeespringjava.beans.Ship;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
//        helloWorld.hello();

//        Ship ship = context.getBean("blackPearl", Ship.class);
//        ship.getCapitan().startSailing();

//        ScopeSingleton singleton1 = context.getBean(ScopeSingleton.class);
//        System.out.println(singleton1);
//        ScopeSingleton singleton2 = context.getBean(ScopeSingleton.class);
//        System.out.println(singleton2);
//        System.out.println((singleton1 == singleton2) + ": ten sam obiekt\n");
//        ScopePrototype prototype1 = context.getBean(ScopePrototype.class);
//        System.out.println(prototype1);
//        ScopePrototype prototype2 = context.getBean(ScopePrototype.class);
//        System.out.println(prototype2);
//        System.out.println((prototype1 == prototype2) + ": dwa różne obiekty");

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());

        context.close();

    }
}
