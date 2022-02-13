package kr.springboot.gofdesignpatterns.singleton.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String SPRINGBOOTKR1 = applicationContext.getBean("SPRINGBOOTKR", String.class);
        String SPRINGBOOTKR2 = applicationContext.getBean("SPRINGBOOTKR", String.class);
        System.out.println(SPRINGBOOTKR1 == SPRINGBOOTKR2);
    }

}
