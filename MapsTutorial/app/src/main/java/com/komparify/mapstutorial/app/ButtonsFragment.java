package com.komparify.mapstutorial.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by komparify on 30/5/14.
 */
public class ButtonsFragment extends Fragment implements  View.OnClickListener {

    View layout;
    Button ch_button,dl_button,k_button;

    public ButtonsFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater layout_inflater,ViewGroup container,Bundle onSavedInstanceState){

        super.onCreateView(layout_inflater,container,onSavedInstanceState);
        layout = layout_inflater.inflate(R.layout.map_buttons,container,false);
        ch_button = (Button)layout.findViewById(R.id.ch_button);
        dl_button = (Button)layout.findViewById(R.id.dl_button);
        k_button = (Button)layout.findViewById(R.id.k_button);

        ch_button.setOnClickListener(this);
        dl_button.setOnClickListener(this);
        k_button.setOnClickListener(this);

//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.ui_container, new MyListFragment());
//        fragmentTransaction.commit();


        return layout;

    }

    public void onCreate(Bundle onSavedInstanceState){
        super.onCreate(onSavedInstanceState);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.ch_button:
                ((MainActivity)getActivity()).setCameraPosition(13.052414,80.250825);
                break;
            case R.id.dl_button :
                ((MainActivity)getActivity()).setCameraPosition(28.635308,77.224960);
                break;
            case R.id.k_button:
                ((MainActivity)getActivity()).setCameraPosition(77.224960,88.363895);
                break;

        }

    }
}
