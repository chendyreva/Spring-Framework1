package Hw1;

import javafx.scene.Camera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        SurgeryImp surgeryImp = new SurgeryImp();
//        IRegistrySurgery surgery = new PsyhologistSurgery();
//        surgeryImp.setSurgery(surgery);
        // surgeryImp.doRecord();
//        Registry registry = new Registry();
//        SurgeryImp surgeryImp = registry.getSurgery();
//        surgeryImp.doRecord();

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ICamera camera = context.getBean("registry", IRegistry.class);
//        registry.doRecord();


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IRegistry registry = context.getBean("registry", IRegistry.class);
        registry.doRecord();

    }
}
