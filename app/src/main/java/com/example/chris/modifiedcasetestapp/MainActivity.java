package com.example.chris.modifiedcasetestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void helloworld () throws IOException {
        System.out.println("Hello, World");
    }

    public static void foo1 () throws IOException {
        FileOutputStream fos1 = new FileOutputStream(new File("whatever.txt"));
        fos1.write(10);   //DOH! What if exception?
        fos1.close();
    }
}
