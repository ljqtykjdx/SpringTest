package com.example.springtest.LJQ.Controller;

import com.example.springtest.LJQ.POJO.SysConfig;
import com.example.springtest.LJQ.Service.HelloWordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.rmi.ServerException;
import java.util.List;

@Controller
@RequestMapping("/Hello")
public class HelloWord {
    @Resource
    private HelloWordService helloWordService;

    @ResponseBody
    @RequestMapping(value = "/123", method = RequestMethod.GET)
    public Object helloWord(String variable) throws Exception {
        try {
            Object ret = helloWordService.selectHelloWord(variable);
            return ret;
        } catch (ServerException ex) {
            throw ex;
        } catch (Exception e) {
            throw new ServerException("同步流程实例列表出现错误", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/321", method = RequestMethod.POST)
    public Object wordHello(@RequestBody String variable){
            Object ret = helloWordService.selectWordHello(variable);
            return ret;
    }
}
