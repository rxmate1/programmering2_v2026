package no.hiof.oleedvao.lecture12;

import no.hiof.oleedvao.lecture12.util.UnitConverter;

public class UsingUtilityClasses {
    public static void main (String[] args) {
      //  UnitConverter unitConverter = new UnitConverter();

        double resultCmToMeter = UnitConverter.cmtoMeter(600);
        System.out.println(" 600cm is " + resultCmToMeter + "meter");
        double resultMeterToCm = UnitConverter.meterToCm(3);
        System.out.println(" 3 meter is " + resultMeterToCm + "cm");

       // UnitConverter.CM_METER_FACTOR = 3773;

        double resultMeterToKm = UnitConverter.meterToKm(50000);
        System.out.println(" 50000 meter is " + resultMeterToKm + "km");
        double resultKmToMeter = UnitConverter.kmToMeter(4);
        System.out.println(" 4 km is " + resultKmToMeter + "meter");
    }
}
