## SpringCloudDemo

教程地址
https://www.fangzhipeng.com/spring-cloud.html

### Eureka

Eureka注重服务可用性AP

Zookeeper注重一致性CP

默认注册中心地址：

```java
    this.serviceUrl.put("defaultZone", "http://localhost:8761/eureka/");
```

集群搭建

Node-01
```yaml
server:
  port: 8761
eureka:
  client:
    register-with-eureka: true
    fetch-registry: false
    service-url:
      defaultZone: http://eureka-node01:8761/eureka,http://eureka-node02:8762/eureka,http://eureka-node03:8763/eureka
spring:
  application:
    name: EurekaServer
```

Node-02
```yaml
server:
  port: 8762
eureka:
  client:
    register-with-eureka: true
    fetch-registry: false
    service-url:
      defaultZone: http://eureka-node01:8761/eureka,http://eureka-node02:8762/eureka,http://eureka-node03:8763/eureka
spring:
  application:
    name: EurekaServer
```

Node-03
```yaml
server:
  port: 8763
eureka:
  client:
    register-with-eureka: true
    fetch-registry: false
    service-url:
      defaultZone: http://eureka-node01:8761/eureka,http://eureka-node02:8762/eureka,http://eureka-node03:8763/eureka
spring:
  application:
    name: EurekaServer
```

自保模式

> 如果在15分钟内超过85%的客户端节点都没有正常的心跳，那么Eureka就认为客户端与注册中心出现了网络故障，Eureka Server自动进入自我保护机制

> eureka.server.enable-self-preservation=true/false

https://github.com/Netflix/eureka/wiki/Server-Self-Preservation-Mode

REST接口

https://github.com/Netflix/eureka/wiki/Eureka-REST-operations

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

