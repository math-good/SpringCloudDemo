package org.example.CircuitBreaker.command;

import com.netflix.hystrix.*;

import java.util.HashMap;
import java.util.Map;

public class QueryOrderIdCommand extends HystrixCommand<Integer> {

    private Map<String, Integer> cache = new HashMap<>();

    private String name;

    public QueryOrderIdCommand(String name) {
        super(
                Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("orderService"))
                        .andCommandKey(HystrixCommandKey.Factory.asKey("queryByOrder"))
                        .andCommandPropertiesDefaults(
                                HystrixCommandProperties.Setter()
                                        .withCircuitBreakerRequestVolumeThreshold(10)
                                        .withCircuitBreakerSleepWindowInMilliseconds(5000)
                                        .withCircuitBreakerErrorThresholdPercentage(50)
                                        .withExecutionTimeoutEnabled(true)
                        ).andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(10)));
        this.name = name;

        cache.put("a", 1);
        cache.put("b", 2);
    }

    protected QueryOrderIdCommand(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected Integer run() throws Exception {
        //查缓存
        return cache.get(name);
    }

    @Override
    protected Integer getFallback() {
        //查数据库
        System.out.println("找不到" + name + "，返回-1");
        return -1;
    }
}
