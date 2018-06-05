[![Build Status](https://travis-ci.org/crossoverJie/springboot-cloud.svg?branch=master)](https://travis-ci.org/crossoverJie/springboot-cloud)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badge/)
[![](https://badge.juejin.im/entry/59514b615188250d7f23e576/likes.svg?style=flat-square)](https://juejin.im/post/59514b3a6fb9a06bcb7f75b8)

# springboot-cloud

:point_right:基于springBoot+springCloud构建的分布式微服务。:point_left:

## 目录结构
```shell
├── sbc-common                                    // common包，通用组件。  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder/common  // 具体代码。  
│   ├── ├──resources
├── sbc-gateway-zuul                              // 网关应用.  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/gateway/zuul     //                     :8383端口 .
│   ├── ├──resources
├── sbc-order                                     // order应用            :8181端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder         // 具体代码
│   ├── ├──resources
├── sbc-service                                   // eureka-server注册中心 :8888端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/service/         // 具体代码
│   ├── ├──resources
├── sbc-user                                      // user应用             :8080端口
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcuser/
│   ├── ├──resources
├── sbc-request-check                             // 去重starter
│   ├── src/main
│   ├── ├──com/crossoverJie/request/check         // 具体代码。 
│   ├── ├──├──anotation                           // 注解
│   ├── ├──├──conf                                // 自动化配置相关类
│   ├── ├──├──interceptor                         // 切面
│   ├── ├──├──properties                          // 配置封装类
│   ├── ├──resources
│   ├── ├──├──META-INF
│   ├── ├──├──├──spring.factories                 // 自动化配置文件
├── sbc-hystix-turbine                            // Hystrix 面板         :8282 端口.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/hystrix/turbine
│   ├── ├──resources
├── .gitignore                                    // git忽略项
├── LICENSE                
├── README.md               


```

## TODO LIST

* [x] [SpringBoot+SpringCloud初探](http://crossoverjie.top/2017/06/15/sbc1/)
* [x] [`Feign`声明式远程调用,`Eureka`高可用注册中心,`Swagger2`管理`REST API`](http://crossoverjie.top/2017/07/19/sbc2/)
* [x] [自定义`Starter-SpringBoot`重构去重插件](https://crossoverjie.top/2017/08/01/sbc3/)
* [x] [应用限流](http://crossoverjie.top/2017/08/11/sbc4/)
* [x] [`Hystrix`服务的保护与容错](https://crossoverjie.top/2017/09/20/sbc5/)
* [x] [`Zuul`网关应用](http://crossoverjie.top/2017/11/28/sbc6/)
* [ ] 排查利器 ———— 分布式追踪
* [ ] 更多功能未完待续。。。

## 应用截图
![https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg](https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg)

![05.jpg](https://i.loli.net/2017/07/21/5970ea9544a8c.jpg)

![03.jpg](https://i.loli.net/2017/08/01/59803ca7d603d.jpg)

![令牌桶算法-来自网络.gif](https://i.loli.net/2017/08/11/598c91f2a33af.gif)

![hystrix](https://ws3.sinaimg.cn/large/006tNc79ly1fjrb6v5ww7j31ga0dr416.jpg)

![Zuul](https://ws3.sinaimg.cn/large/006tKfTcly1flx79q95c0j30o80m8757.jpg)


# 联系作者
- [crossoverJie@gmail.com](mailto:crossoverJie@gmail.com)

![](https://ws1.sinaimg.cn/large/006tKfTcly1frz6eaf3s4j308c0au0ss.jpg)


