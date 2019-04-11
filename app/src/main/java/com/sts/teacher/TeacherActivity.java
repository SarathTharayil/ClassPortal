package com.sts.teacher;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.notification);
    }
    public void fn(View view){
        if(view==b1){
            Intent intent=new Intent(TeacherActivity.this,SubjectList.class);
            startActivity(intent);
        }
        else if(view==b2){
            Intent intent=new Intent(TeacherActivity.this,AddStudentActivity.class);
            startActivity(intent);
        }
        else if(view==b3){
            Intent intent=new Intent(TeacherActivity.this,SelectRollNo.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(TeacherActivity.this,NotificationActivity.class);
            startActivity(intent);
        }
    }
}
