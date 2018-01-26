package com.tencent.myapplication;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mmaug.mmfont.utils.FontUtils;
import org.mmaug.mmfont.utils.Fonts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.tencent.myapplication.MMTextView textView = (com.tencent.myapplication.MMTextView)findViewById(R.id.textTmp);
     //   com.tencent.myapplication.MMTextView textView2 = (com.tencent.myapplication.MMTextView)findViewById(R.id.textTmp2);
        com.tencent.myapplication.MMTextView textView3 = (com.tencent.myapplication.MMTextView)findViewById(R.id.textTmp3);
       // FontUtils fontUtils = new FontUtils(this);
      //  Typeface tf_mm3 = Typeface.createFromAsset(getAssets(), "fonts/zawgyione.ttf");
      //  textView.setTypeface(tf_mm3);

        textView.setMyanmarText("မိုဘိုင္းေဒတာျဖင့္အသံုးျပဳမႈအတြက္ သတိေပးခ်က္မျမည္ေအာင္ေရြးခ်ယ္မည္။ လုပ္ေဆာင္မလား။");

        textView3.setMyanmarText("ကြန္ရက္အမွားအယြင္းေၾကာင့္ အလိုအေလ်ာက္ေဒါင္းလုဒ္လုပ္ျခင္း ယာယီရပ္ဆိုင္းသြားပါမည္။");

        com.tencent.myapplication.MMButtonView btn = (com.tencent.myapplication.MMButtonView)findViewById(R.id.test1);
        btn.setMyanmarText("သင္ခ်ိတ္ဆက္ခဲ့ေသာအေကာင့္မ်ားျဖင့္ JOOX အားအျခားကိရိယာမ်ားတြင္လဲ Log In ၀င္ႏိုင္သည္။");
        final LayoutInflater inflater = this.getLayoutInflater();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(v.getContext());
// ...Irrelevant code for customizing the buttons and title

                View dialogView = inflater.inflate(R.layout.adialog, null);
                dialogBuilder.setView(dialogView);

                com.tencent.myapplication.MMTextView textDialog = (com.tencent.myapplication.MMTextView) dialogView.findViewById(R.id.textDialog);
                textDialog.setMyanmarText("အခမဲ့သံုးစြဲသူမ်ားသည္ ၁ နာရီတြင္ ၆ ၾကိမ္ေက်ာ္ႏိုင္သည္။အကန္႔အသတ္မရွိသီခ်င္းမ်ားေက်ာ္ရန္ VIP ရယူပါ။");
                AlertDialog alertDialog = dialogBuilder.create();
                alertDialog.show();

            }
        });

        //  fontUtils.setTypeFace(Fonts.ZG, textView);

    }
}
