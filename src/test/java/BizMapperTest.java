

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.entity.Dept;
import com.hand.entity.Emp;
import com.hand.mapper.EmpMapper;

public class BizMapperTest {

    private EmpMapper empMapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext-mybatis.xml" });
        empMapper = context.getBean(EmpMapper.class);
    }

    @Test
    public void testGetAllEmp() {
        List<Emp> allEmp = empMapper.getAllEmp();
        for (Emp emp : allEmp) {
            System.err.println(emp);
        }
    }
    
    @Test
    public void testGetAllDept() {
        List<Dept> allDept = empMapper.getAllDept();
        for (Dept dept : allDept) {
            System.err.println(dept);
        }
    }

}
