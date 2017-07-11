package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.EmptyableVerifier;
import com.eqdd.nextinputs.Texts;

/**
 * 中国11位手机号校验器
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.1
 */
public class MobileVerifier extends EmptyableVerifier {

    /**
     * 中国移动：134,135,136,137,138,139,147,150,151,152,157,158,158,178,182,183,184,187,188
     * 中国联通：130,131,132,145,155,156,175,176,185,186
     * 中国电信：133,134,149,153,173,177,180,181,189
     * 虚拟运营商：170,171
     */
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return Texts.regexMatch(notEmptyInput, "^(\\+?\\d{2}-?)?1[34578]\\d{9}$");
    }
}
