package com.example.dubbo.provider;

import com.example.dubbo.api.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private static final String PREFIX = "hello";

    @Override
    public String sayHello(String name) {
        return PREFIX + name;
    }
}
