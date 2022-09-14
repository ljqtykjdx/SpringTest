package com.example.springtest.LJQ.Service.impl;
import com.example.springtest.LJQ.Dao.HelloWordDao;
import com.example.springtest.LJQ.Service.HelloWordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;




@Service
public class HelloWordServiceImpl implements HelloWordService {

    @Resource
    private HelloWordDao helloWordDao ;

    public Object selectHelloWord(String variable) throws Exception {
        return  helloWordDao.selectHellow(variable);
    }

    @Override
    public Object selectWordHello(String variable) {
        return   helloWordDao.selectwHello(variable);
    }
}
