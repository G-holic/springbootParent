package cn.itcast;

import cn.itcast.dao.EmployeeDao;
import cn.itcast.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisJoinApplicationTests {

    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {
        Employee employee = employeeDao.getById(2);
        System.out.println("employee = " + employee);
    }

}
