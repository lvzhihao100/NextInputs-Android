package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.Texts;
import com.eqdd.nextinputs.Verifier;

/**
 * 非空校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotEmptyVerifier implements Verifier {
    @Override
    public boolean perform(String rawInput) throws Exception {
        return !Texts.isEmpty(rawInput);
    }
}
