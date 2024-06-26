// “On my honor, I have neither received nor given
// any unauthorized assistance on this assignment."
//Byron Gomez Jr

package com.byrongomezjr.doodlz;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
   // configures the screen orientation for this app
   @SuppressLint("SourceLockedOrientationActivity")
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      // determine screen size
      int screenSize =
         getResources().getConfiguration().screenLayout &
            Configuration.SCREENLAYOUT_SIZE_MASK;

      // use landscape for extra large tablets; otherwise, use portrait
      if (screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE)
         setRequestedOrientation(
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
      else
         setRequestedOrientation(
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
   }
}

