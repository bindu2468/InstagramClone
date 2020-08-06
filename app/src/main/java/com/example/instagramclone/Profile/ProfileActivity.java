package com.example.instagramclone.Profile;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.instagramclone.R;
import com.example.instagramclone.Utilis.BottomNavigationViewHelper;
import com.example.instagramclone.Utilis.GridImageAdapter;
import com.example.instagramclone.Utilis.UniversalImageLoader;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";

    private ProgressBar mProgressBar;

    private static final int ACTIVITY_NUM =2;
    private static final int NUM_GRID_COLUMNS = 3;

    private Context mContext = ProfileActivity.this;
    private  ImageView profilePhoto;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");

        init();

    /*    setupBottomNavigationView();
        setupToolBar();
        setupActivityWidgets();
        setProfileImage();
        tempGridSetup();
*/
    }

    private void init(){
        Log.d(TAG, "init: inflating " + getString(R.string.profile_fragment));

        ProfileFragment fragment = new ProfileFragment();
        FragmentTransaction transaction = ProfileActivity.this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.addToBackStack(getString(R.string.profile_fragment));
        transaction.commit();
    }

  /*  private void tempGridSetup(){
        ArrayList<String> imgURLs = new ArrayList<>();
        imgURLs.add("https://i.pinimg.com/474x/13/7b/fd/137bfd878208da1d3f02a224b113cd20.jpg");
        imgURLs.add("https://i.pinimg.com/474x/ba/65/07/ba6507de2eda990a7936f688ef748979--indian-goddess-parvati-goddess.jpg");
        imgURLs.add("https://i.pinimg.com/474x/51/b5/6a/51b56a16eb22bfc7176e03a6df488a30.jpg");
        imgURLs.add("https://i.pinimg.com/474x/bd/2e/66/bd2e66ae597b64775048e7656c0efe26.jpg");
        imgURLs.add("https://i.pinimg.com/474x/9f/ac/37/9fac37d979381fa57364c0834bee46f7.jpg");
        imgURLs.add("https://i.pinimg.com/474x/3e/46/ea/3e46ea1af6f3d32240f2d472e96bba9a.jpg");
        imgURLs.add("https://i.pinimg.com/474x/82/12/03/821203d719c59f0f66e0d92c871c1d9c.jpg");
        imgURLs.add("https://i.pinimg.com/474x/e7/75/45/e7754578e55fbedce8e5ad9a6fadca73.jpg");
        imgURLs.add("https://i.pinimg.com/474x/01/de/94/01de94773460435e3480bb324d07c5d5.jpg");
        imgURLs.add("https://i.pinimg.com/474x/18/25/3e/18253ea67636b341446192e9229e966a.jpg");
        imgURLs.add("https://i.pinimg.com/474x/c0/83/9f/c0839fdb5cecbca3f7153a12e49391b1.jpg");
        imgURLs.add("https://i.pinimg.com/474x/83/ea/1d/83ea1dbd619708b3c33847e0592f0080--indian-gods-background-ideas.jpg");
        imgURLs.add("https://i.pinimg.com/474x/53/bd/81/53bd81bf943d75b41ec3b2951699dbbe.jpg");
        imgURLs.add("https://i.pinimg.com/474x/c4/e3/2e/c4e32e859c0f3410c3e3435245b0dde2.jpg");

        setupImageGrid(imgURLs);
    }

    private void setupImageGrid(ArrayList<String> imgURLs) {

        GridView gridView = (GridView)findViewById(R.id.gridView);

        int gridWidth = getResources().getDisplayMetrics().widthPixels;
        int imageWidth = gridWidth/NUM_GRID_COLUMNS;
        gridView.setColumnWidth(imageWidth);

        GridImageAdapter adapter = new GridImageAdapter(mContext, R.layout.layout_grid_imageview,"",imgURLs);
        gridView.setAdapter(adapter);

    }

    private void setProfileImage(){

        Log.d(TAG, "setProfileImage: setting profile photo");
        String imgURL ="www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge/public/article_images/2016/08/ac-lloyd.jpg";
        UniversalImageLoader.setImage(imgURL, profilePhoto, mProgressBar, "https://");
    }

    private void setupActivityWidgets(){

        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
    }

    private void setupToolBar(){
        Toolbar toolbar = findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        ImageView profileMenu= (ImageView) findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: navigating to account settings");

                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);

            }
        });
    }


    private void setupBottomNavigationView(){
        Log.d(TAG, "setBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx =(BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    } */


}
