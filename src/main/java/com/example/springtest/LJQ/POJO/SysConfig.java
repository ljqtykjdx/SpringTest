package com.example.springtest.LJQ.POJO;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_config")
public class SysConfig {
    @Id
    @Column(name = "variable")
    private String isVariable;
    @Column(name = "value")
    private String isValue;
    @Column(name = "set_time")
    private String isSetTime;
    @Column(name = "set_by")
    private String isSetBy;

    public void setIsVariable(String isVariable) {
        this.isVariable = isVariable;
    }

    public void setIsValue(String isValue) {
        this.isValue = isValue;
    }

    public void setIsSetTime(String isSetTime) {
        this.isSetTime = isSetTime;
    }

    public void setIsSetBy(String isSetBy) {
        this.isSetBy = isSetBy;
    }

    @Override
    public String toString() {
        return "SysConfig{" +
                "isVariable='" + isVariable + '\'' +
                ", isValue='" + isValue + '\'' +
                ", isSetTime='" + isSetTime + '\'' +
                ", isSetBy='" + isSetBy + '\'' +
                '}';
    }
}
