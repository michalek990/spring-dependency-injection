package guru.springframework.diexample;

import guru.springframework.diexample.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Properties;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiExampleApplication.class, args);

        i18nController i18nController = (i18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) context.getBean("myController");

//        String greetings = myController.sayHello();
//
//        System.out.println(greetings);

        System.out.println("-----------Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-----------Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetings());

        System.out.println("---------Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());
    }

}
