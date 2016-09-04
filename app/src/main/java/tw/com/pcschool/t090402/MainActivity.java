package tw.com.pcschool.t090402;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    SharedPreferences sp;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView);
        sp = getSharedPreferences("mydata", MODE_PRIVATE);
    }

    public void clickSave(View v)
    {
        SharedPreferences.Editor editor = sp.edit();
        String value = ed.getText().toString();

        editor.putString("v1", value);

        editor.commit();
    }

    public void clickLoad(View v)
    {
        String value = sp.getString("v1", "Teacher");
        tv.setText(value);
    }
}
