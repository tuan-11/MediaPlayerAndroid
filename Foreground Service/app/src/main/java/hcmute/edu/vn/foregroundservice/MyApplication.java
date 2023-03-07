package hcmute.edu.vn.foregroundservice;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class MyApplication extends Application {

    public static final String CHANNEL_ID = "channel_service_example";

    @Override
    public void onCreate() {
        super.onCreate();

        createChannelNotification();
    }

    private void createChannelNotification() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel chanel = new NotificationChannel(CHANNEL_ID,
                    "Channel Service Example", NotificationManager.IMPORTANCE_DEFAULT);

            chanel.setSound(null, null);

            NotificationManager manager = getSystemService(NotificationManager.class);
            if(manager != null) {
                manager.createNotificationChannel(chanel);
            }

        }
    }
}
