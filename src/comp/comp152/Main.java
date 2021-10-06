package comp.comp152;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var inNetworkDoctors = new ArrayList<Doctor>();
        inNetworkDoctors.add(new Doctor("Pricey University", 400));
        inNetworkDoctors.add(new Surgeon("Children's Hospital", "Fancy Univ", 1000.0));
        var sickPerson1 = new Person("Stu Dent");
        var sickPerson2 = new Person("Some Body");
        var picker = new Random();
        var choice = picker.nextInt(inNetworkDoctors.size());
        Doctor doc = inNetworkDoctors.get(choice);
        doc.treatPatient(sickPerson1);
        doc.billPatient(sickPerson1);
        System.out.println(doc);
        WeekDay appointmentDay = WeekDay.Monday;
    }
}
