package com.akexiu.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;
import java.util.UUID;

/**
 * 描述:
 * 定义消息的推送管道
 *
 * @outhor akexiu
 * @create 2020-03-16 20:21
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {
    //消息发送管道
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial:\t\t" + serial);
        return null;
    }
}
