package com.naos.globalconverterimpl.service;

import com.naos.globalconverterimpl.constant.*;
import org.apache.commons.lang3.tuple.Pair;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

import static com.naos.globalconverterimpl.constant.ConversionType.*;
import static com.naos.globalconverterimpl.constant.LengthConversionUnit.*;

public class ConverterService {

    private static final Map<ConversionType, ConversionUnit[]> conversionTypeUnitsMap
            = Map.of(
                    LENGTH, LengthConversionUnit.values(),
                    TIME, TimeConversionUnit.values(),
                    PRESSURE, PressureConversionUnit.values(),
                    MASS, MassConversionUnit.values(),
                    VOLUME, VolumeConversionUnit.values(),
                    AREA, AreaConversionUnit.values(),
                    SPEED, SpeedConversionUnit.values(),
                    TEMPERATURE, TemperatureConversionUnit.values(),
                    ENERGY, EnergyConversionUnit.values(),
                    FREQUENCY, FrequencyConversionUnit.values()
            );

    private static final Map<Pair<LengthConversionUnit, LengthConversionUnit>, Function<BigDecimal, BigDecimal>> conversionUnitFunctionsMap
            = Map.of(
                Pair.of(METER, FOOT), originalValue -> originalValue.multiply(BigDecimal.valueOf(3.281)),
                Pair.of(METER, YARD), originalValue -> originalValue.multiply(BigDecimal.valueOf(1.094))
            );

    public static ConversionUnit[] getConversionUnitsForSelectedType(ConversionType conversionType) {
        return conversionTypeUnitsMap.get(conversionType);
    }

    public static BigDecimal convert(LengthConversionUnit fromUnit, LengthConversionUnit toUnit, BigDecimal originalValue) {
        return conversionUnitFunctionsMap.get(Pair.of(fromUnit, toUnit)).apply(originalValue);
    }
}
