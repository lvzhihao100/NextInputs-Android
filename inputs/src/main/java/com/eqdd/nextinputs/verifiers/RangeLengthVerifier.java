package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.PairedVerifier;
import com.eqdd.nextinputs.Loader2A;

/**
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class RangeLengthVerifier extends PairedVerifier<Long> {

    public RangeLengthVerifier(Loader2A<Long> valueLoader) {
        super(valueLoader);
    }

    public RangeLengthVerifier(long fixedFirstValue, long fixedSecondValue) {
        super(fixedFirstValue, fixedSecondValue);
    }

    @Override
    protected boolean performTyped(Long typedInput) {
        final long minLength  = benchmark1stValue();
        final long maxLength  = benchmark2ndValue();
        return minLength <= typedInput && typedInput <= maxLength;
    }

    @Override
    protected Long typedCast(String notEmptyInput) {
        return (long)notEmptyInput.length();
    }
}
