package blog.sidvitech.com.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import blog.sidvitech.com.activity.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class signup extends Fragment {

    TextView tvsgnpg;
    View view;

    public signup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_signup, container, false);

        tvsgnpg= (TextView) view.findViewById(R.id.tvrtrnlgnsupg);
        tvsgnpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f=new Login();
                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.flfrholder,f);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }

}
