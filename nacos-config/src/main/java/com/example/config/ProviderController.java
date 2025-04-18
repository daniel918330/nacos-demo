package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//配置发布之后，动态刷新配置
@RefreshScope
@RestController
@RequestMapping("provider")
public class ProviderController
{
    // 使用原生注解@Value()导入配置
    @Value("${user.id}")
    private String id;
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @GetMapping("getNacosConfig")
    public String providerTest()
    {
        return "我是provider，已成功获取nacos配置中心的数据：(id:" + id + ",name:" + name + ",age:" + age +")";
    }
}