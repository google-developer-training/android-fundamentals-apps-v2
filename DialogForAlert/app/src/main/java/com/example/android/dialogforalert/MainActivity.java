/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dialogforalert;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * This app shows a button to trigger a standard alert dialog.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creates the view.
     *
     * @param savedInstanceState Saved instance state bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handles the Alert button click. Builds the alert dialog with a title,
     * message, and OK and Cancel buttons. Also defines Toast messages to appear
     * depending on which alert button is clicked, and shows the alert dialog.
     *
     * @param view  The view in which the alert will appear.
     */
    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder =
                new AlertDialog.Builder(MainActivity.this);

        // Set the dialog title and message.
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);

        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                Toast.makeText(getApplicationContext(),
                        R.string.pressed_ok,
                        Toast.LENGTH_SHORT).show();
            }
        });
        
        myAlertBuilder.setNegativeButton(R.string.cancel_button,
                new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // User cancelled the dialog.
                Toast.makeText(getApplicationContext(),
                        R.string.pressed_cancel,
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}
