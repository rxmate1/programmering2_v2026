package no.hiof.oleedvao.lecture12.util;

public final class UnitConverter {

    public final static int CM_METER_FACTOR = 100;
    public final static int METER_KM_FACTOR = 1000;
    private UnitConverter() {}

    public static double cmtoMeter(double cm) {
        return cm / CM_METER_FACTOR;
    }

    public static double meterToCm(double meter) {
        return meter * CM_METER_FACTOR;
    }

    public static double meterToKm(double meter) {
        return meter / METER_KM_FACTOR;
    }

    public static double kmToMeter(double km) {
        return km * METER_KM_FACTOR;
    }
}
