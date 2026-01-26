package com.chatlogprser;

public interface MessageFilter<T> {

    boolean allow(T message);
}