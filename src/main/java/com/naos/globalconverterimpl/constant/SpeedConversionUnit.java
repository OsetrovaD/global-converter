package com.naos.globalconverterimpl.constant;

public enum SpeedConversionUnit implements ConversionUnit {
    MILE_PER_HOUR("MILE_PER_HOUR"), FEET_PER_SECOND("FEET PER SECOND"),
    METER_PER_SECOND("METER PER SECOND"), KILOMETER_PER_HOUR("KILOMETER PER HOUR"), KNOT;

    private final String name;

    SpeedConversionUnit() {
        this.name = this.toString();
    }

    SpeedConversionUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
