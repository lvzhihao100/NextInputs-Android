package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.Texts;
import com.eqdd.nextinputs.Verifier;

/**
 * 非空值(包含制表符等)校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class NotBlankVerifier implements Verifier {
    @Override
    public boolean perform(String rawInput) throws Exception {
        if (Texts.isEmpty(rawInput)) {
            return false;
        }
        return !Texts.regexMatch(rawInput, "^\\s*$");
    }
}
