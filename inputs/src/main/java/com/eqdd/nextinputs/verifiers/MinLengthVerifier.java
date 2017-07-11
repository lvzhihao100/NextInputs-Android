package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.Loader1A;
import com.eqdd.nextinputs.SingleVerifier;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MinLengthVerifier extends SingleVerifier<Long> {

    public MinLengthVerifier(Loader1A<Long> valueLoader) {
        super(valueLoader);
    }

    public MinLengthVerifier(long fixedValue) {
        super(fixedValue);
    }

    @Override
    protected Long typedCast(String notEmptyInput) {
        return (long) notEmptyInput.length();
    }

    @Override
    protected boolean performTyped(Long typedInput) {
        return typedInput >= getBenchmarkValue();
    }

}
