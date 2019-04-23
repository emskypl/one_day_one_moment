package com.example.uiemskyconcept;

import android.app.Activity;
import android.view.View;

public class SystemUI extends Activity {



    public void hideSystemUI(View decorView){
        int hideSystemUI = ( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);
        decorView.setSystemUiVisibility(hideSystemUI);
    }

    private void showSystemUI(View decorView) {
        int showSystemUI = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        decorView.setSystemUiVisibility(showSystemUI);

    }

}
