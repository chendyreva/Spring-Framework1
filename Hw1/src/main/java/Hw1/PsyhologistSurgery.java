package Hw1;

import org.springframework.stereotype.Component;

@Component("PsyhologistSurgery")
public class PsyhologistSurgery implements IRegistrySurgery {
    @Override
    public void processing() {
        System.out.println("- вы записаны к психологу!");
    }
}