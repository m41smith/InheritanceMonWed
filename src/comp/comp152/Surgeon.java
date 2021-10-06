package comp.comp152;

public class Surgeon extends Doctor{
    private String hospital;

    public Surgeon(String hospital, String medSchool, double fee){
        super(medSchool, fee);
        this.hospital = hospital;
    }

    @Override
    public void treatPatient(Person patient){
        System.out.println("Surgeon who graduated from "+ AlmaMater + " doing surgery at "+ hospital);
        super.treatPatient(patient);
    }
}
