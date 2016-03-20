package com.db2.dubbo.service.impl;

import com.db2.dubbo.model.People;
import com.db2.dubbo.service.SpeakInterface;

/**
 * Created by dengbin on 2016/3/20.
 */
public class SpeakInterfaceImpl implements SpeakInterface {

    public String speak(People people) {
        return people.toString();
    }
}
