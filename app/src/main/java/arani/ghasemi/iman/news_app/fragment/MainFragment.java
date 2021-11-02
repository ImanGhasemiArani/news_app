package arani.ghasemi.iman.news_app.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Field;

import arani.ghasemi.iman.news_app.R;


public class MainFragment extends Fragment {

    private View view;
    private Typeface typeface;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private ImageView imgToolbarMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_main, container, false);

        init();
        implementNavigation();
        implementToolbar();

        return view;
    }

    private void init() {

        typeface = Typeface.createFromAsset(getContext().getAssets(), "IRAN_Sans.ttf");
        drawerLayout = view.findViewById(R.id.drawerLayout);
        navigationView = view.findViewById(R.id.navigation_view);
        imgToolbarMenu = view.findViewById(R.id.img_toolbar_menu);

    }

    private void implementNavigation() {
        try {
            Field field = Typeface.class.getDeclaredField("MONOSPACE");
            field.setAccessible(true);
            field.set(null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.menu_edit_info) {
                Toast.makeText(view.getContext(),"ویرایش اطلاعات", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.menu_setting) {
                Toast.makeText(view.getContext(),"تنظیمات", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.menu_share) {
                Toast.makeText(view.getContext(),"اشتراک گذاری", Toast.LENGTH_SHORT).show();
            }

            drawerLayout.closeDrawer(Gravity.RIGHT);
            return false;
        });
    }

    private void implementToolbar() {

        imgToolbarMenu.setOnClickListener(view->{
            if (drawerLayout.isDrawerOpen(Gravity.RIGHT))
                drawerLayout.closeDrawer(Gravity.RIGHT);
            else
                drawerLayout.openDrawer(Gravity.RIGHT);
        });
    }
 }