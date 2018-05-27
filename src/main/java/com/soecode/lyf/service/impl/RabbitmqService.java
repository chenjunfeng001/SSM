package com.soecode.lyf.service.impl;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * @Description:
 * @Auther: chenjunfeng
 * @Date: 2018/5/26 15:00
 */
public class RabbitmqService implements MessageListener {

    public void onMessage(Message message) {
        try {
            String body = new String(message.getBody(), "UTF-8");
            System.out.println("消息消费者 = " + body);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
