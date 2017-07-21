# springboot-cloud

:point_right:基于springBoot+springCloud构建的分布式微服务。:point_left:

## 目录结构
```shell
├── sbc-common                                    // common包，通用组件。  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder/common  // 具体代码。  
│   ├── ├──resources
├── sbc-order                                     // order应用            :8181端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder         // 具体代码
│   ├── ├──resources
├── sbc-service                                   // eureka-server注册中心 :8888端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/service/         // 具体代码
│   ├── ├──resources
├── sbc-user                                      // user应用             :8080端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcuser/
│   ├── ├──resources
├── .gitignore                                    // git忽略项
├── LICENSE                
├── README.md               


```

## TODO LIST

* [x] [http://crossoverjie.top/2017/06/15/sbc1/](SpringBoot+SpringCloud初探)
* [x] [http://crossoverjie.top/2017/07/19/sbc2/](`Feign`声明式远程调用,`Eureka`高可用注册中心,`Swagger2`管理`REST API`)
* [ ] 基于`SpringBoot`重构:[https://github.com/crossoverJie/SSM-REQUEST-CHECK](https://github.com/crossoverJie/SSM-REQUEST-CHECK)
* [ ] 通用的异常处理、日志插件、集成logback。
* [ ] 更多功能未完待续。。。

## 应用截图
![https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg](https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg)

# 联系作者
- [crossoverJie@gmail.com](mailto:crossoverJie@gmail.com)

![weixinchat.jpg](https://i.loli.net/2017/07/21/5971592b04340.jpg)




