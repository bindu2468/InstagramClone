package com.example.instagramclone.Profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagramclone.R;
import com.example.instagramclone.Utilis.UniversalImageLoader;

public class EditProfileFragment extends Fragment {
    private static final String TAG = "EditProfileFragment";

    private ImageView mProfilePhoto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
        mProfilePhoto =(ImageView)view.findViewById(R.id.profile_photo);

        setProfileImage();

        //setup back Arrow for navigating back to profileActivity

        ImageView backArrow = (ImageView) view.findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: navigating back to profileActivity");
                getActivity().finish();
            }
        });

        return view;

    }


    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image");
        String imgURL ="www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge/public/article_images/2016/08/ac-lloyd.jpg";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto,null, "https://");
    }

}