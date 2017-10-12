import com.zc.bean.TwpUser;
import com.zc.service.TwpUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by zhangchengli on 2017/10/12.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml","classpath:spring-shiro.xml",
    "classpath:dispatcher-servlet.xml"})
public class Junit4SpringTest {

    @Resource
    private TwpUserService twpUserService;

    @Test
    public void testMethod1(){

        TwpUser twpUser = twpUserService.get(1);

        Assert.assertEquals(twpUser.getUserName(), "张三");
    }

}
