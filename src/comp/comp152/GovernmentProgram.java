package comp.comp152;

import java.util.Random;

public class GovernmentProgram {
    private String programType;

    public GovernmentProgram(){
        String[] types = {"Medicare", "Medicaid", "VA", "ObamaCare", "CongressCare"};
        var numberPicker = new Random();
        var pick = numberPicker.nextInt(5);
        programType = types[pick];
    }

    public void payBill(double bill){
        if (programType.equals("CongressCare"))
            System.out.println(programType + " Just paid a bill of "+ bill*3);
        else
            System.out.println(programType+" just paid a bill of "+ bill);
    }
}
