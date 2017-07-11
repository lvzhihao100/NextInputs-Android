package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.Loader2A;
import com.eqdd.nextinputs.PairedVerifier;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeValueVerifier extends PairedVerifier<Double> {

    public RangeValueVerifier(Loader2A<Double> valueLoader) {
        super(valueLoader);
    }

    public RangeValueVerifier(double fixedFirstValue, double fixedSecondValue) {
        super(fixedFirstValue, fixedSecondValue);
    }

    @Override
    protected boolean performTyped(Double typedInput) {
        final Double minLength  = benchmark1stValue();
        final Double maxLength  = benchmark2ndValue();
        return (minLength < typedInput || minLength.equals(typedInput))
                && (typedInput < maxLength || typedInput.equals(maxLength));
    }

    @Override
    protected Double typedCast(String notEmptyInput) {
        return Double.parseDouble(notEmptyInput);
    }
}
