package com.sritechsoftsolutions.asynctask_java;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MyTask extends AsyncTask {
    ImageView imageView;
    Bitmap bmp;
    MyTask(ImageView imgView)
    {
       this.imageView=imgView;
    }
    @Override
    protected Object doInBackground(Object[] objects) {

        try {
            URL  u = new URL("https://images.pexels.com/photos/1319911/pexels-photo-1319911.jpeg?cs=srgb&dl=beautiful-beauty-cute-1319911.jpg&fm=jpg");
            InputStream ism = u.openStream();
            bmp = BitmapFactory.decodeStream(ism);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        imageView.setImageBitmap(bmp);

    }
}
