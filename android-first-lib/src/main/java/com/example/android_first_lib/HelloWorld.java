package com.example.android_first_lib;

import android.content.Context;
import android.widget.Toast;

public class HelloWorld {
    public static void MyToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
