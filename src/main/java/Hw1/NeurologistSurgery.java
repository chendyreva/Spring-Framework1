package Hw1;

import org.springframework.stereotype.Component;

@Component("NeurologistSurgery")
public class NeurologistSurgery implements IRegistrySurgery {
    @Override
    public void processing() {
        System.out.println("- вы записаны к неврологу!");
    }
}
