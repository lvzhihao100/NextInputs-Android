package com.eqdd.nextinputs;

import java.io.Serializable;

/**
 * 数据懒加载器
 * @author 陈小锅 (yoojia.chen@gmail.com)
 * @since 1.8
 */
public interface Loader1A<T> extends Serializable {

    /**
     * 在需要加载数据时,将在此方法中返回数据
     * @return Value
     */
    T getValue();

}
