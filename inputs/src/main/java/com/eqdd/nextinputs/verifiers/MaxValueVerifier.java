package com.eqdd.nextinputs.verifiers;


import com.eqdd.nextinputs.Loader1A;
import com.eqdd.nextinputs.SingleVerifier;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MaxValueVerifier extends SingleVerifier<Double> {

    public MaxValueVerifier(Loader1A<Double> valueLoader) {
        super(valueLoader);
    }

    public MaxValueVerifier(double fixedValue) {
        super(fixedValue);
    }

    @Override
    protected Double typedCast(String notEmptyInput) {
        return Double.parseDouble(notEmptyInput);
    }

    @Override
    protected boolean performTyped(Double typedInput) {
        final Double based = getBenchmarkValue();
        return typedInput < based || typedInput.equals(based);
    }

}
