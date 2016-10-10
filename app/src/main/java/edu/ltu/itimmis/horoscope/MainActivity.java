package edu.ltu.itimmis.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity
    implements HoroscopeListFragment.HoroscopeListListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HoroscopeDetailFragment frag = (HoroscopeDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setHoroscope(1);
    }

    @Override
    public void itemClicked(long id)
    {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            // the code to set the detail will go here
            HoroscopeDetailFragment details = new HoroscopeDetailFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            details.setHoroscope(id);
            ft.replace(R.id.fragment_container, details);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else
        {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_HOROSCOPE_ID, (int)id);
            startActivity(intent);
        }
    }
}
