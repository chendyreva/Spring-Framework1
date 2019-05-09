package Hw1;

public class Registry {
    public SurgeryImp getSurgery() {
        SurgeryImp surgeryImp = new SurgeryImp();
        IRegistrySurgery surgery = new PsyhologistSurgery();
        surgeryImp.setSurgery(surgery);
        return surgeryImp;
    }
}