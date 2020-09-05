package com.example.mascotas2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mascotas2.adapter.PagerAdapter;
import com.example.mascotas2.fragments.PerfilFragment;
import com.example.mascotas2.fragments.RecyclerViewFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar=findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);


        setUpViewPager();

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }
    private void setUpViewPager(){
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.home);
        tabLayout.getTabAt(1).setIcon(R.drawable.perro);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override//Metodo para establecer el menu y decidir en caso de que escoja una de las dos opciones

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mContacto:
                Intent myIntent=new Intent(this, ContactoActivity.class);
                startActivity(myIntent);
                break;

            case R.id.mAbout:
                Intent myIntent2=new Intent(this, AboutActivity.class);
                startActivity(myIntent2);
                break;

            case R.id.mStar:
                Intent myIntent3=new Intent(this, MascotasFavoritas.class);
                startActivity(myIntent3);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}