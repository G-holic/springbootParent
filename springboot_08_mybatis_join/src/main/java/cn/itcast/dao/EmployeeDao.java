package cn.itcast.dao;

import cn.itcast.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper // 自动代理
@Repository
public interface EmployeeDao {


    @Select("select * from tbl_employee where id=#{id}")
    public Employee getById(Integer id);
}
