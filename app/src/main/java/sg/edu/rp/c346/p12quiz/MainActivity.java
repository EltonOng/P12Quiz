package sg.edu.rp.c346.p12quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spnLink;
    WebView wvUrl;

    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnLink = findViewById(R.id.spinner);
        wvUrl = findViewById(R.id.webViewUrl);



        spnLink.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        //url = "facebook";
                        wvUrl.loadUrl("https://www.google.com");
                        break;
                    case 1:
                        WebSettings wbs = wvUrl.getSettings();
                        //wbs.setJavaScriptEnabled(true);
                        url = "https://www.rp.edu.sg/";
                        wvUrl.loadUrl(url);
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
