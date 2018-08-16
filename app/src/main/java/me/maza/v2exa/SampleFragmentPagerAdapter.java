package me.maza.v2exa;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.maza.v2exa.PageFragment;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    public static Tag tabTitles[] = new Tag[]{
            new Tag(0, "最热"),
            new Tag(1, "全部"),
            new Tag(2, "R2")};

    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        return PageFragment.newInstance(i + 1);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position].getTitle();
    }
}
