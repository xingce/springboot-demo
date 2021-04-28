package com.example.rpc;

/**
 * @author xingce
 * @date 2021/3/1 21:38
 */
public class RunMain {
    public static void main(String[] args) {
        RpcService service = RpcFunction.refer(RpcService.class, "127.0.0.1", 1412);
        System.out.println(service.sayHello());
    }
}