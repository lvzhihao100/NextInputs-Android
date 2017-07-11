package com.eqdd.inputs;

import android.widget.EditText;
import android.widget.TextView;

import com.eqdd.nextinputs.Loader1A;

/**
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public class TextLazyLoader implements Loader1A<String> {

    private final TextView mInput;

    public TextLazyLoader(TextView input) {
        mInput = input;
    }

    @Override
    public String getValue() {
        return String.valueOf(mInput.getText());
    }

    public static TextLazyLoader textView(TextView textView){
        return new TextLazyLoader(textView);
    }

    public static TextLazyLoader editText(EditText editText) {
        return textView(editText);
    }
}