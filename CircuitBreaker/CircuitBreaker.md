## CircuitBreaker 断路器的基本概念和原理

断路器概念 https://martinfowler.com/bliki/CircuitBreaker.html

![断路器](https://martinfowler.com/bliki/images/circuitBreaker/sketch.png)

断路器的基本思路很简单。通过将待保护的函数调用包裹在断路器对象中，让断路器对象来监控失败。当失败次数达到特定的阈值时，断路器打开，后续对此断路器对象的访问将直接返回 error，根本不会调用受保护的函数。通常，你会想在断路器打开的时候得到某种监控预警。

```java
void circuitbreaker(){
    if closed {
        //目标函数
        call target()
    }else{
        throw exception()
    }
}
```

## 开源实现

https://github.com/Netflix/Hystrix

https://github.com/resilience4j/resilience4j

