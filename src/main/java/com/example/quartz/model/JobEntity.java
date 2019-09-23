package com.example.quartz.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("job_entity")
@Data
public class JobEntity {

    private Integer id;
    /**job名称**/
    private String name ;
    /**job组名**/
    private String group ;
    /**执行的cron**/
    private String cron ;
    /**job的参数**/
    private String parameter;
    /**job描述信息**/
    private String description ;
    /**vm参数**/
    private String vmParam ;
    /**job的jar路径**/
    private String jarPath ;
    /**job的执行状态,只有该值为OPEN才会执行该Job**/
    private String status ;
}
