package edu.ltu.itimmis.horoscope;


import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;


import edu.ltu.itimmis.horoscope.Horoscope;
import edu.ltu.itimmis.horoscope.R;

/**
 * A simple {@link ListFragment} subclass.
 */
public class HoroscopeListFragment extends ListFragment
{
    public static interface HoroscopeListListener {
        void itemClicked(long id);
    }

    private HoroscopeListListener listener;

    public HoroscopeListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        String[] names = new String[Horoscope.horoscopes.length];
        for (int i = 0; i < names.length; i++)
        {
            names[i] = Horoscope.horoscopes[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);

        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (HoroscopeListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}
