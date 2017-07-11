package com.eqdd.nextinputs;

import java.io.Serializable;

import static com.eqdd.nextinputs.Texts.isEmpty;


/**
 * Allow empty input Verifier
 *
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public abstract class EmptyableVerifier implements Verifier, Serializable {

    @Override
    public final boolean perform(String rawInput) throws Exception {
        if (isEmpty(rawInput)) {
            return true;
        } else {
            return performTestNotEmpty(rawInput);
        }
    }

    public abstract boolean performTestNotEmpty(String notEmptyInput) throws Exception;

}
