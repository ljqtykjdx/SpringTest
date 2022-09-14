package com.example.springtest.LJQ.Dao.Impl;
import com.example.springtest.LJQ.Dao.HelloWordDao;
import com.example.springtest.LJQ.Mapper.HelloWordMapper;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;


@Repository
public class HelloWordDaoImpl implements HelloWordDao {

    @Resource
    HelloWordMapper helloWordMapper;

    @Override
    public String selectHellow(String variable) {
       return helloWordMapper.selectHelloWord(variable);
    }

    @Override
    public Object selectwHello(String variable) {
        return helloWordMapper.selectWordHello(variable);
    }
}
