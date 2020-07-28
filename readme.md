## SpringCloudDemo

教程地址
https://www.fangzhipeng.com/spring-cloud.html

### eureka

### zuul

api网关

Filter 集成ZuulFilter类

filterType取值范围

pre：路由之前

routing：路由之时

post： 路由之后

error：发送错误调用

### ribbon

客户端负责均衡器，配合eureka使用


### feign

> 声明式伪HTTP客户端，支持可插拔的编码器和解码器，集成了Ribbon和Eureka结合可实现负载均衡

1. 基于接口的注解
2. 整合了Ribbon

默认使用HttpURLConnection客户端

可修改为okhttp

```xml
    <dependency>
        <groupId>io.github.openfeign</groupId>
        <artifactId>feign-okhttp</artifactId>
        <version>11.0</version>
    </dependency>
```

```yaml
feign:
  httpclient:
    enabled: false
  okhttp:
    enabled: true
```

### hystrix

断路器

### config

本地配置文件

spring.cloud.config.server.native.search-locations: classpath:/shared

git配置文件

spring.cloud.config.server.git.uri: https://github.com/SpringCloudConfig/

客户端配置：

```java
spring:
  cloud:
    config:
      label: master
      profile: dev
      uri: http://localhost:8080
      name: application
  application:
    name: ConfigClient
```

客户端加载不到配置问题：

创建bootstrap.yml配置文件，将spring.cloud.config相关配置放入该文件中

### Zipkin

分布式追踪

