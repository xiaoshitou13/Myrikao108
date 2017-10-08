package test.bwie.com.myrikao108;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import presenter.Fangfa;
import presenter.Jiaohu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , Fangfa{

    /**
     * 用户
     */
    private TextView mTextView;
    private EditText mUserName;
    /**
     * 密码
     */
    private TextView mTextView2;
    private EditText mUserMima;
    /**
     * 登录
     */
    private Button mButton;
    private Jiaohu jiaohu  = new Jiaohu(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mUserName = (EditText) findViewById(R.id.UserName);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mUserMima = (EditText) findViewById(R.id.UserMima);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                  jiaohu.loginss();
                break;
        }
    }

    @Override
    public String getName() {
        return mUserName.getText().toString();
    }

    @Override
    public String getMima() {
        return mUserMima.getText().toString();
    }

    @Override
    public void show() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Chenggong(Bean m) {
     //  mUserMima.setText(m.getMima());
    }

    @Override
    public void Full() {

    }
}
