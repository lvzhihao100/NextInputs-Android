package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.EmptyableVerifier;
import com.eqdd.nextinputs.Texts;

/**
 * 邮件地址校验器
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class EmailVerifier extends EmptyableVerifier {
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return Texts.regexMatch(notEmptyInput.toLowerCase(), "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+" +
                "(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+" +
                "[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
    }
}
