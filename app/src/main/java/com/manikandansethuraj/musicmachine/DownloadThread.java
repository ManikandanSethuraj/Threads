package com.manikandansethuraj.musicmachine;

import android.os.Looper;
import android.util.Log;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-08-02.
 */
public class DownloadThread extends Thread {

    public DownloadHandler mdownloadHandler;
    @Override
    public void run() {

        Looper.prepare();    // creates looper for thread and also creates the message Queue.
        mdownloadHandler = new DownloadHandler();
        Looper.loop();   // starts looping over the message queue.



//        for(String song : Playlist.songs){      // for each song the loop runs
//            downloadSong(song);
//        }

        //super.run();
    }



}
