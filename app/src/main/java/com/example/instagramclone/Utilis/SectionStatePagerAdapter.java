package com.example.instagramclone.Utilis;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {

    private  final List<Fragment> mFragmentList = new ArrayList<>();
    private  final HashMap<Fragment, Integer> mFragments = new HashMap<>();
    private  final HashMap<String, Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer, String> mFragmentNames = new HashMap<>();

    public SectionStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String fragmentNames){
        mFragmentList.add(fragment);
        mFragments.put(fragment, mFragmentList.size()-1);
        mFragmentNumbers.put(fragmentNames, mFragmentList.size()-1);
        mFragmentNames.put(mFragmentList.size()-1, fragmentNames);
    }

    /**
     *  return the fragment with the name  @param
     * @param fragmentNames
     * @return
     */

    public Integer getFragmentNumber(String fragmentNames) {
        if(mFragmentNumbers.containsKey(fragmentNames)){
            return mFragmentNumbers.get(fragmentNames);
        }
        else {
            return null;
        }
    }

    /**
     *  return the fragment with the name  @param
     * @param fragment
     * @return
     */

    public Integer getFragmentNumber(Fragment fragment) {
        if(mFragmentNumbers.containsKey(fragment)){
            return mFragmentNumbers.get(fragment);
        }
        else {
            return null;
        }
    }

    /**
     *  return the fragment with the name  @param
     * @param fragmentNumber
     * @return
     */
    public String getFragmentNames(Integer fragmentNumber) {
        if(mFragmentNames.containsKey(fragmentNumber)) {
            return mFragmentNames.get(fragmentNumber);
        }
        else {
            return null;
        }
    }
}
