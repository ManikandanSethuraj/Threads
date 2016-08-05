package com.manikandansethuraj.musicmachine;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button downloadButton;
    private static MainActivity parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DownloadThread thread = new DownloadThread();
        thread.setName("DownloadSong");
        thread.start();

        downloadButton = (Button) findViewById(R.id.download_button);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Downloading Songs",Toast.LENGTH_SHORT).show();

                for (String song : Playlist.songs){
                    Message message = Message.obtain();  // No need to create new Message as Android OS has a pool of messages for use.
                    message.obj = song;  // Message.obj adds any type of object  to the message
                    thread.mdownloadHandler.sendMessage(message);  // sending message to the Handler.

                }

//           //     Runnable runnable = new Runnable() {
//                    @Override
//                    public void run() {
//                        downloadSong();
//                    }
//                };


            }
        });
    }

//    private void downloadSong() {
//
//
//        long time = System.currentTimeMillis() + 10*1000;
//        while (time >= System.currentTimeMillis()){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//        Log.d("MainActivity","Downlaoded");
//       // Toast.makeText(parent.getBaseContext(),"Song Downloaded",Toast.LENGTH_SHORT).show();
//
//    }
}
