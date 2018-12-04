package application.android.example.com.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button3);
    }
    public void changeFragment(View view)
    {
        Fragment fragment;
        if(view==findViewById(R.id.button))
        {
            fragment = new Fregment1();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();

        }
        if(view==findViewById(R.id.button2))
        {
            fragment= new Fregment2();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
        if(view==findViewById(R.id.button3)){
            fragment=new Fragment4();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
    }
}
