package kr.springboot.gofdesignpatterns.singleton.ex7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "SPRINGBOOTKR")
    public String hello() {
        return "springboot.kr";
    }

}
