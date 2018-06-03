package com.brh.cjf.web;

import com.brh.cjf.service.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: chenjunfeng
 * @Date: 2018/5/26 14:28
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Producer producer;

    @Value("#{appConfig['mq.queue']}")
    private String queueId;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @ResponseBody
    @RequestMapping("/sendQueue")
    public String testQueue(){
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data","hello rabbitmq");
        //第二个属性是Queue与交换机绑定的路由
        try {
            producer.sendQueue(queueId+"_exchange",
                    queueId+"_patt",map);

        }catch (Exception e){
            e.printStackTrace();
        }

        return "发送完毕";


    }

}
