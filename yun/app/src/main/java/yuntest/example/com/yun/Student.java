package yuntest.example.com.yun;

import cn.bmob.v3.BmobObject;

/**
 * Created by yf on 2020/3/19.
 */

public class Student extends BmobObject{
    private String no;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
}
