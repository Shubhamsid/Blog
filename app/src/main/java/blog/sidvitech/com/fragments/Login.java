package blog.sidvitech.com.fragments;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Button;

import blog.sidvitech.com.activity.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {

    EditText uname;
    View view;
    Button btnlogin;
    TextView tvlink,tvlinksignup;
    Fragment f;
    public Login() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_login, container, false);
        btnlogin = (Button) view.findViewById(R.id.btnlogin1);
        tvlink= (TextView) view.findViewById(R.id.tvforgotpassword);
        tvlinksignup= (TextView) view.findViewById(R.id.tvrgstrlink);
        uname= (EditText) view.findViewById(R.id.etmailidl);
//        Drawable drawable = tvlink.getBackground(); // get current EditText drawable
//        if(isValidEmail(uname.getText())) {
//            uname.setError(Html.fromHtml("<font color='blue'>this is the error</font>"));
//        }else {
//
//            uname.setError(Html.fromHtml("<font color='blue'>this is the error</font>"));
//        }

        tvlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=new forgotPassword();
                setFragment(f);
//                Toast.makeText(getContext(),"you click on forget password",Toast.LENGTH_SHORT).show();
//                FragmentManager fm=getActivity().getSupportFragmentManager();
//                FragmentTransaction ft=fm.beginTransaction();
//                ft.replace(R.id.flfrholder,f);
////                fm.beginTransaction().add(R.id.flfrholder,f).commit();
//                ft.addToBackStack(null);
//                ft.commit();
            }
        });

        tvlinksignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=new signup();
                setFragment(f);
                Toast.makeText(getContext(),"you click on forget password",Toast.LENGTH_SHORT).show();
//                FragmentManager fm=getActivity().getSupportFragmentManager();
//                FragmentTransaction ft=fm.beginTransaction();
//                ft.replace(R.id.flfrholder,f);
////                fm.beginTransaction().add(R.id.flfrholder,f).commit();
//                ft.addToBackStack(null);
//                ft.commit();
            }
        });
        return view;
    }

    public void setFragment(Fragment f){
        Toast.makeText(getContext(),"fragment "+f.toString(),Toast.LENGTH_SHORT).show();
        FragmentManager fm=getActivity().getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.flfrholder,f);
        ft.addToBackStack(null);
        ft.commit();
    }

    public  boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }


}
