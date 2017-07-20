package com.eqdd.nextinputs;

import java.io.Serializable;

/**
 * 数据懒加载器
 * @author 陈小锅 (yoojia.chen@gmail.com)
 * @since 1.8
 */
public interface Loader2B<T> extends Serializable {

    T getFirstValue();

    T getSecondValue();

}
