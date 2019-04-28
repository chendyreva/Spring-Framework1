package Hw1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Hw1")
public class AppConfig {
//    @Bean(name = "Surgery")
//    public IRegistrySurgery surgery() {
//        return new PsyhologistSurgery();
//    }

//    @Bean(name = "registry")
//    public IRegistry registry(IRegistrySurgery surgery) {
//        SurgeryImp registry = new SurgeryImp();
//        registry.setSurgery(surgery);
//        return registry;
//    }
}
