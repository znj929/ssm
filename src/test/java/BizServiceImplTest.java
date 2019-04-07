/*package cn.bdqn.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;

import cn.bdqn.pojo.Dept;
import cn.bdqn.pojo.Emp;
import cn.bdqn.service.BizService;

public class BizServiceImplTest {

    private BizService bizService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext-log.xml",
                        "applicationContext-mybatis.xml",
                        "applicationContext-service.xml",
                        "applicationContext-transaction.xml" });
        bizService = context.getBean(BizService.class);
    }

    @Test
    public void testGetAllEmp() {
        List<Emp> allEmp = bizService.getAllEmp();
        System.err.println(allEmp);
    }

    @Test
    public void testGetAllDept() {
        List<Dept> allDept = bizService.getAllDept();
        System.err.println(allDept);
    }

    @Test
    public void testGetAllEmpPage() {
        PageInfo<Emp> pageInfo = bizService.getAllEmpPage(3, 3);
    }
}
*/