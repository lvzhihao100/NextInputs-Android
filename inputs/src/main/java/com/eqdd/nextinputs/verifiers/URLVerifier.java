package com.eqdd.nextinputs.verifiers;

import com.eqdd.nextinputs.EmptyableVerifier;

import static com.eqdd.nextinputs.Texts.regexMatch;

/**
 * URL地址校验器
 * @author YOOJIA CHEN (yoojiachen@gmail.com)
 * @since 1.1
 */
public class URLVerifier extends EmptyableVerifier {
    @Override
    public boolean performTestNotEmpty(String notEmptyInput) throws Exception {
        return regexMatch(notEmptyInput.toLowerCase(),
                "^(https?:\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?$");
    }
}
