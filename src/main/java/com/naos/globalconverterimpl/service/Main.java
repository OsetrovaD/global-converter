package com.naos.globalconverterimpl.service;

import com.naos.globalconverterimpl.constant.ConversionType;
import com.naos.globalconverterimpl.constant.LengthConversionUnit;

import java.math.BigDecimal;
import java.util.Arrays;

// For testing purposes only
// TODO: Remove before release
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ConverterService.getConversionUnitsForSelectedType(ConversionType.AREA)));
        System.out.println("RESULT: " + ConverterService.convert(LengthConversionUnit.METER, LengthConversionUnit.FOOT, BigDecimal.valueOf(3)));
    }
}
