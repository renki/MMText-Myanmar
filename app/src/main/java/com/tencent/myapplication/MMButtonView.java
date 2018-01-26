package com.tencent.myapplication;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by myatminsoe on 9/27/15.
 */
public class MMButtonView extends android.support.v7.widget.AppCompatButton {

    public MMButtonView(Context context) {
        super(context);
        TextHelper.setTypeface(context, this);
    }

    public MMButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TextHelper.setTypeface(context, this);
    }

    public MMButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TextHelper.setTypeface(context, this);
    }

    public void setMyanmarText(String st) {
        setText(mmtext.processText(st, mmtext.TEXT_ZAWGYI, true, true));
    }

    public CharSequence getMyanmarText() {
        return mmtext.getMMText(this);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}