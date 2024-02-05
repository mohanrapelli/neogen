package com.example.frame.activties;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.frame.R;
import com.example.frame.fragments.Aboutus;
import com.example.frame.fragments.Careers;
import com.example.frame.fragments.Contact;
import com.example.frame.fragments.Development;
import com.example.frame.fragments.Home;
import com.example.frame.fragments.services.Appdevelopment;
import com.example.frame.fragments.services.Databasemanagement;
import com.example.frame.fragments.services.Digitalmarketing;
import com.example.frame.fragments.services.ERPsolutions;
import com.example.frame.fragments.services.IOTtechnologies;
import com.example.frame.fragments.services.Payroll;
import com.example.frame.fragments.services.Testing;
import com.example.frame.fragments.services.Webdevelopment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(new Home());

        ImageView imageView = findViewById(R.id.imagelogo);
        ImageView imageView1 = findViewById(R.id.facebook);
        ImageView imageView2 = findViewById(R.id.linkedin);
        ImageView imageView3 = findViewById(R.id.instagram);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aptsolglobal.com/#");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.facebook.com/neogensofttech");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://in.linkedin.com/company/neogen-softtech-solutions");
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.instagram.com/neogensofttech/");
            }
        });



        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        NavigationDrawer();
    }

    private void NavigationDrawer() {
        ImageView imageView = findViewById(R.id.side);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.nav_home) {
            replaceFragment(new Home());
        } else if (itemId == R.id.about_us) {
            replaceFragment(new Aboutus());
        } else if (itemId == R.id.development) {
            replaceFragment(new Development());
        } else if (itemId == R.id.careers) {
            replaceFragment(new Careers());
        } else if (itemId == R.id.contact) {
            replaceFragment(new Contact());
        }
            else if (item.getItemId() == R.id.page1) {
                replaceFragment(new Webdevelopment());
            } else if (item.getItemId() == R.id.page2) {
                replaceFragment(new Databasemanagement());
            } else if (item.getItemId() == R.id.page3) {
                replaceFragment(new Appdevelopment());
            } else if (item.getItemId() == R.id.page4) {
                replaceFragment(new Digitalmarketing());
            } else if (item.getItemId() == R.id.page5) {
                replaceFragment(new Testing());
            } else if (item.getItemId() == R.id.page6) {
                replaceFragment(new ERPsolutions());
            } else if (item.getItemId() == R.id.page7) {
                replaceFragment(new Payroll());
            } else if (item.getItemId() == R.id.page8) {
                replaceFragment(new IOTtechnologies());
            }




        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.side_nav, menu);
        for (int i = 0; i < menu.size(); i++) {

        }

        return true;
    }
}
