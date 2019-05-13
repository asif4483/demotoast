package com.bncinfotech.myimgvlib;

import android.content.Context;
import android.widget.Toast;

public class Toastmgs {

    public static void s(Context context, String msg)
    {

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();



}
}
