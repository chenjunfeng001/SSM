package com.soecode.lyf.service;

/**
 * @Description: 生产者-消息队列发送者
 * @Auther: chenjunfeng
 * @Date: 2018/5/26 14:51
 */
public interface Producer {
    public void sendQueue(String exchange_key, String queue_key, Object object);
}
