package com.example.spi;

/**
 * @author xingce
 * @date 2021/02/05 0:44
 */
public class SpiServiceImpl implements SpiService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}