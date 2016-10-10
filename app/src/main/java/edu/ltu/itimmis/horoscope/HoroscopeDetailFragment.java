package edu.ltu.itimmis.horoscope;


import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HoroscopeDetailFragment extends Fragment {
    private long horoscopeId;

    public HoroscopeDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            horoscopeId = savedInstanceState.getLong("horoscopeId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_horoscope_detail, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Horoscope horoscope = Horoscope.horoscopes[(int) horoscopeId];
            title.setText(horoscope.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(horoscope.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("horoscopeId", horoscopeId);
    }

    public void setHoroscope(long id)
    {
        this.horoscopeId = id;
    }
}
