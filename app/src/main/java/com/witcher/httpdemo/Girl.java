package com.witcher.httpdemo;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by Zou Sheng on 2016/4/17.
 */
public class Girl {
    Bitmap bitmap;
    public Girl(Bitmap bitmap){
        this.bitmap=bitmap;
    }
    public Bitmap getGirl(){
        return bitmap;
    }
}
