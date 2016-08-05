package com.manikandansethuraj.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-08-02.
 */
public class DownloadHandler extends Handler {

    private static final String TAG = DownloadHandler.class.getSimpleName();

    @Override
    public void handleMessage(Message msg) {
        downloadSong(msg.obj.toString());
    }

    private void downloadSong(String songName) {


        long time = System.currentTimeMillis() + 10*1000;
        while (time >= System.currentTimeMillis()){
            try {
                Thread.sleep(1000);    // the thread sleeps for 1000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        Log.d(TAG,"Downlaoded: "+songName);
        // Toast.makeText(parent.getBaseContext(),"Song Downloaded",Toast.LENGTH_SHORT).show();

    }
}
