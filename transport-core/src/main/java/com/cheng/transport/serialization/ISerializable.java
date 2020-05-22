package com.cheng.transport.serialization;

/**
 * Netty消息序列化接口
 */
public interface ISerializable {

    <T> byte[] serializable(T obj);

    <T> T deSerializable(byte[] bytes, Class<T> obj);

    String getCoderName();
}