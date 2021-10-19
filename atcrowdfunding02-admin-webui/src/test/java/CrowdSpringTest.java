import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdSpringTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void testTx(){
        Admin admin = new Admin(null, "jery", "12334", "杰瑞", "3324552", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void test() throws SQLException {

        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

    @Test
    public void testInsertAdmin(){

        Admin admin = new Admin(null,"huahf","12333","johong","3324552",null);
        int count = adminMapper.insert(admin);
        System.out.println(count);
    }
}
