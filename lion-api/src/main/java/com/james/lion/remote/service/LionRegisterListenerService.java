package com.james.lion.remote.service;

/**
 * Created by james.li on 2015-03-22 10:04:44.
 */
public interface LionRegisterListenerService {

    public boolean registerListener(String projectName, String listenerURL, int env);

}