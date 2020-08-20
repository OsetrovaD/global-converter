package com.naos.globalconverterimpl.constant;

public enum AreaConversionUnit implements ConversionUnit {
    SQUARE_METER("SQUARE METER"), SQUARE_MILE("SQUARE MILE"), SQUARE_YARD("SQUARE YARD"),
    SQUARE_FOOT("SQUARE FOOT"), SQUARE_INCH("SQUARE INCH"), HECTARE, ACR;

    private final String name;

    AreaConversionUnit() {
        this.name = super.toString();
    }

    AreaConversionUnit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
