package com.eqdd.nextinputs;

import java.io.Serializable;

/**
 * 校验器
 * @author 陈小锅 (yoojiachen@gmail.com)
 * @since 1.1
 */
public interface Verifier extends Serializable{

    /**
     * 执行校验
     * @param rawInput 原始输入数据
     * @return 校验是否通过
     * @throws Exception If error
     */
    boolean perform(String rawInput) throws Exception;

}
