package retu.placeinfo.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retu.placeinfo.R;

/**
 * Created by Retu on 02-12-17.
 */

public class Overview extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        return inflater.inflate(R.layout.overview_fragment_layout, null);
    }
}
