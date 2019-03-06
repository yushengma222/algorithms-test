package com.example.algorithms.jsontest;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultDefaultValueProcessor;
import net.sf.json.processors.DefaultValueProcessor;
import net.sf.json.processors.JsDateJsonBeanProcessor;
import net.sf.json.processors.JsonValueProcessor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

import java.math.BigDecimal;
import java.net.StandardSocketOptions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author yushengma
 */
@RestController
public class JsonTestController {

    @RequestMapping(path = "/jsondate", method = RequestMethod.POST)
    public void testJsonDate(@RequestBody Person person) {
        System.out.println("Person====" + "name: " + person.getName() + " and birthDate: " + person.getBirthDate() + " and money: " + person.getMoney());
        String personStr = JSON.toJSONString(person);
        System.out.println("Person====JSON=====" + personStr);
        Person person1 = JSON.parseObject(personStr, Person.class);
        System.out.println("Person====JSON=====Person====" + "name: " + person1.getName() + " and birthDate: " + person1.getBirthDate() + " and money: " + person.getMoney());
        com.alibaba.fastjson.JSONObject personJson = JSON.parseObject(personStr);
        System.out.println("Person====JSONFast====" + personJson);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerDefaultValueProcessor(BigDecimal.class, new DefaultDefaultValueProcessor(){
            @Override
            public Object getDefaultValue(Class type) {
                return "";
            }
        });
        JSONObject personStrFrom = JSONObject.fromObject(person, jsonConfig);
        System.out.println("Person====JSONObject====NOT" + personStrFrom);
        System.out.println("Person====JSONObject====String====NOT" + personStrFrom.toString());
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonValueProcessor() {
            @Override
            public Object processArrayValue(Object o, JsonConfig jsonConfig) {
                return process(o);
            }

            @Override
            public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
                return process(o);
            }

            private Object process(Object value) {
                if (value instanceof Date) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
                    return sdf.format(value);
                }
                return value == null ? "" : value.toString();
            }
        });
        JSONObject personStrFrom2 = JSONObject.fromObject(person, jsonConfig);
        System.out.println("Person====JSONObject====" + personStrFrom2);
        System.out.println("Person====JSONObject====String====" + personStrFrom2.toString());

        System.out.println("====================================================================");
    }
}
