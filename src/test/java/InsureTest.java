import com.lxx.Application;
import com.lxx.controller.test.TestB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class InsureTest {

    @Test
    public void TestB (){
        TestB b =new TestB();
        String c =b.insure();
        System.out.println(c);
    }
}
