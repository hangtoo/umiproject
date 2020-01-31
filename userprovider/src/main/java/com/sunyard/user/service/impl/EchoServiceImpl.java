package com.sunyard.user.service.impl;

import com.sunyard.user.service.EchoService;

@org.apache.dubbo.config.annotation.Service
class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}