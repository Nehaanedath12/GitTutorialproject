package com.example.tutorialproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
     

        System.out.println("Local State") ;





        b1.setOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(b1,"Sample Snack Bar",Snackbar.LENGTH_LONG);
            snackbar.show();

        });

        System.out.println("This is data commited in second") ;

        System.out.println("This is data commited in fourth") ;
        
        System.out.println("Change 1") ;
    }
}