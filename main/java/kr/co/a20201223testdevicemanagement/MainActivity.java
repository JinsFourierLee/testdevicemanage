package kr.co.a20201223testdevicemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText eText;
        final String management_pw = "01094191291";
        final int num_devices = 80;
        Button button_next;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        eText = (EditText)findViewById(R.id.user_deviceID);
        button_next = (Button) findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = eText.getText().toString();
                if(str.equals(management_pw)){ // 관리자번호와 일치하는 경우 관리자 화면으로 이동
                    Toast.makeText(getBaseContext(),"관리자 화면 이동", Toast.LENGTH_LONG).show();
                }
                else if( Integer.parseInt(str) <= num_devices){ // 기존 원장 phoneID 값에 있는 경우 N 0002 00 으로 이동
                    Toast.makeText(getBaseContext(),"메인화면 이동", Toast.LENGTH_LONG).show();

                }else{ // 중복된 값이 없는 경우 N 0001 01 으로 이동
                    Toast.makeText(getBaseContext(),"등록화면 이동", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}