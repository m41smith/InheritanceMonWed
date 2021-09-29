package comp.comp152;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public void treatPatient(Person patient){
        System.out.println("Place holder for treat patient");
    }

    public double billPatient(Person patient){
        return fee;
    }

    public double billPatient(boolean isMedicare, GovernmentProgram program){
        if (isMedicare)
            return fee/2;
        return fee;
    }
}
