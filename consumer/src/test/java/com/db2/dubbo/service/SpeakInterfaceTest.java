package com.db2.dubbo.service;

import com.db2.dubbo.model.People;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dengbin on 2016/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring_context.xml", "classpath*:spring_dubbo_consumer.xml"})
public class SpeakInterfaceTest {

    @Resource
    private SpeakInterface speakInterface;

    @Test
    public void test() {
        People people = new People();
        people.setId(1);
        people.setName("db2");
        System.out.println(speakInterface.speak(people));
        Assert.assertEquals(true, speakInterface.speak(people).contains("db2"));
    }
}
