package com.example.springtest.LJQ.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface HelloWordMapper {

        @Select("SELECT sys.value FROM sys_config sys Where variable = #{variable}")
        String selectHelloWord(String isVariable);

        @Select("SELECT sys.value FROM sys_config sys Where variable = #{variable}")
        Object selectWordHello(String variable);
}
