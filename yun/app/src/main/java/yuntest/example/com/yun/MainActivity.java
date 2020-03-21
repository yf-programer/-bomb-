package yuntest.example.com.yun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.exception.BmobException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this, "db4f9f061298384615f39dd2c7860e65");
        Student st = new Student();
        st.setName("yf");
        st.setNo("201724100233");
        st.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if (e == null) {
                    Toast.makeText(getApplication(), "添加数据成功" ,Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplication(), "失败" +e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
