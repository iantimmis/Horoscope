package edu.ltu.itimmis.horoscope;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity
{
    public static final String EXTRA_HOROSCOPE_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        HoroscopeDetailFragment horoscopeDetailFragment = (HoroscopeDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        int horoscopeId = (int) getIntent().getExtras().get(EXTRA_HOROSCOPE_ID);
        horoscopeDetailFragment.setHoroscope(horoscopeId);
    }
}
