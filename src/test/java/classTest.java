import com.lxx.test.UserInfo;
import org.junit.Test;

import java.lang.reflect.Field;

public class classTest {
    @Test
    public void test1() {

        Class<UserInfo> infoClass = UserInfo.class;
        //获取类中所有的属性字段(public)
        Field[] fields = infoClass.getFields();
        for (Field field : fields) {
            //类中字段的名称
            System.out.println("public field name:" + field.getName());
            //类中字段的类型
            System.out.println("public field type:" + field.getType());

        }
    }
}
