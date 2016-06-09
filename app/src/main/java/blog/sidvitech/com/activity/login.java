package blog.sidvitech.com.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import blog.sidvitech.com.fragments.Login;
import blog.sidvitech.com.fragments.signup;
//import blog.sidvitech.com.fragments.signup;

public class login extends MainActivity{

    Button btnlogin;

    TextView rgstlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin=(Button)findViewById(R.id.btnlogin1);
        rgstlink= (TextView) findViewById(R.id.tvforgotpassword);
        Fragment f=new Login();
        FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.flfrholder,f).commit();
//        init();
    }

//    public void init(){
//        rgstlink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f=new signup();
//                FragmentManager fm=getSupportFragmentManager();
//                fm.beginTransaction().add(R.id.flfrholder,f).commit();
//            }
//        });
//    }

}
