[![Build Status](https://travis-ci.org/crossoverJie/springboot-cloud.svg?branch=master)](https://travis-ci.org/crossoverJie/springboot-cloud)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badge/)
[![](https://badge.juejin.im/entry/59514b615188250d7f23e576/likes.svg?style=flat-square)](https://juejin.im/post/59514b3a6fb9a06bcb7f75b8)

# springboot-cloud

[中文简介](https://github.com/crossoverJie/springboot-cloud/blob/master/README-ZH.md)

:point_right:Distributed Micro Service Based on SpringBoot + springCloud.:point_left:

## Directory Structure
```shell
├── sbc-common                                    // common package.  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder/common  // Specific code.  
│   ├── ├──resources
├── sbc-gateway-zuul                              // gateWay.  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/gateway/zuul     // Specific code.                    :8383 port.
│   ├── ├──resources
├── sbc-order                                     // order app                         :8181 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder         // Specific code.
│   ├── ├──resources
├── sbc-service                                   // eureka-server Registration center :8888 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/service/         // Specific code.
│   ├── ├──resources
├── sbc-user                                      // user app.                         :8080 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcuser/
│   ├── ├──resources
├── sbc-request-check                             // remove duplicates starter.
│   ├── src/main
│   ├── ├──com/crossoverJie/request/check         // Specific code. 
│   ├── ├──├──anotation                           // anotation package.
│   ├── ├──├──conf                                // Automate configuration-related code.
│   ├── ├──├──interceptor                         // Aspect.
│   ├── ├──├──properties                          // configuration.
│   ├── ├──resources
│   ├── ├──├──META-INF
│   ├── ├──├──├──spring.factories                 // Automated configuration files.
├── sbc-hystix-turbine                            // Hystrix Dashboard                 :8282 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/hystrix/turbine
│   ├── ├──resources
├── .gitignore                                    
├── LICENSE                
├── README.md               


```

## TODO LIST

* [x] [SpringBoot+SpringCloud初探](http://crossoverjie.top/2017/06/15/sbc1/)
* [x] [`Feign`声明式远程调用,`Eureka`高可用注册中心,`Swagger2`管理`REST API`](http://crossoverjie.top/2017/07/19/sbc2/)
* [x] [自定义`Starter-SpringBoot`重构去重插件](https://crossoverjie.top/2017/08/01/sbc3/)
* [x] [应用限流](http://crossoverjie.top/2017/08/11/sbc4/)
* [x] [`Hystrix`服务的保护与容错](http://crossoverjie.top/2017/09/20/sbc5/)
* [x] [`Zuul`网关应用](http://crossoverjie.top/2017/11/28/sbc6/)
* [ ] 分布式限流
* [ ] 排查利器 ———— 分布式追踪
* [ ] 更多功能未完待续。。。

## Partial Screenshots
![https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg](https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg)

---

![05.jpg](https://i.loli.net/2017/07/21/5970ea9544a8c.jpg)

---

![03.jpg](https://i.loli.net/2017/08/01/59803ca7d603d.jpg)

---

![令牌桶算法-来自网络.gif](https://i.loli.net/2017/08/11/598c91f2a33af.gif)

![hystrix](https://ws3.sinaimg.cn/large/006tNc79ly1fjrb6v5ww7j31ga0dr416.jpg)

![Zuul](https://ws3.sinaimg.cn/large/006tKfTcly1flx79q95c0j30o80m8757.jpg)

![Distributed](https://ws1.sinaimg.cn/large/006tKfTcly1fqrlvvj8cbj31kw0f1wws.jpg)


# Contact Author
- [crossoverJie@gmail.com](mailto:crossoverJie@gmail.com)

![](https://ws2.sinaimg.cn/large/006tNc79ly1fjrb8w0g03j30by0byq3w.jpg)




