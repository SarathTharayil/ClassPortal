package com.sts.teacher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotificationAddActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_add);

        final EditText editText = findViewById(R.id.notification);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().trim().length()>0){
                    Notification notification = new Notification();
                    notification.setMessage(editText.getText().toString());
                    notification.setTimestamp(System.currentTimeMillis());
                    mDbRef.child("notifications").child(String.valueOf(notification.getTimestamp())).setValue(notification);
                    finish();
                }
            }
        });
    }
}
