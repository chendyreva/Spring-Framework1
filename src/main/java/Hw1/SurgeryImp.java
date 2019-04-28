package Hw1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class SurgeryImp implements IRegistry{
    private IRegistrySurgery surgery;

//    public SurgeryImp(IRegistrySurgery surgery) {
//        this.surgery = surgery;
//    }

    public IRegistrySurgery getSurgery() {
        return surgery;
    }

    @Autowired(required = false)
    @Qualifier("PsyhologistSurgery")
    public void setSurgery(IRegistrySurgery surgery) {
        this.surgery = surgery;
    }

    public void doRecord() {
        System.out.println("Вжух!");
        surgery.processing();
    }
}
