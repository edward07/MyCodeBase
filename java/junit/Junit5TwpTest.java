import com.zc.bean.TwpUser;
import com.zc.service.TwpUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by zhangchengli on 2017/9/28.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml","classpath:spring-shiro.xml",
        "classpath:dispatcher-servlet.xml"})
public class Junit5TwpTest {

    @Resource
    private TwpUserService twpUserService;

    @Test
    public void testTwpGeneralServiceImpl_updateWechatUserInfoCsair(){
        TwpUser twpUser = twpUserService.get(1);
        Assert.assertEquals(twpUser.getUserName(), "张三");
        System.out.println( " === testTwpGeneralServiceImpl_updateWechatUserInfoCsair === " );
    }

    @BeforeAll
    public static void before(){
        System.out.println( " === Before ====== " );
    }


}
