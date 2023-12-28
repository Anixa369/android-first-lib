package com.example.anixastoast;

import android.content.Context;
import android.widget.Toast;

public class AnixasCustomToast {

    public static void CustomToast(Context context,String Msg){
        Toast.makeText(context, Msg, Toast.LENGTH_SHORT).show();
    }
}
