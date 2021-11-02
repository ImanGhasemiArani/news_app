package arani.ghasemi.iman.news_app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import arani.ghasemi.iman.news_app.fragment.MainFragment;
import arani.ghasemi.iman.news_app.fragment.SplashFragment;

public class MainActivity extends AppCompatActivity {

    private static final int delayTime = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SplashFragment splashFragment = new SplashFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, splashFragment);
        fragmentTransaction.commit();

        new Handler().postDelayed(() ->{
            if (isNetworkConnected()) {
                MainFragment mainActivity = new MainFragment();
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.frameLayout, mainActivity);
                fragmentTransaction2.commit();
            } else {
                Toast.makeText(getApplicationContext(),"خطا در اتصال به اینترنت", Toast.LENGTH_LONG).show();
                finish();
            }
        },delayTime);
    }

    private boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null;
    }
}