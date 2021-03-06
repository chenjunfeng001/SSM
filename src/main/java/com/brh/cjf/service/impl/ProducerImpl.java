package com.brh.cjf.service.impl;

import com.brh.cjf.service.Producer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: chenjunfeng
 * @Date: 2018/5/26 14:52
 */
@Service
public class ProducerImpl implements Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendQueue(String exchange_key, String queue_key, Object object) {
        // convertAndSend 将Java对象转换为消息发送至匹配key的交换机中Exchange
        amqpTemplate.convertAndSend(exchange_key, queue_key, object);
    }
}
