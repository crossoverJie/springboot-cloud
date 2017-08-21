# springboot-cloud

[中文简介](https://github.com/crossoverJie/springboot-cloud/blob/master/README-ZH.md)

:point_right:Distributed Micro Service Based on SpringBoot + springCloud.:point_left:

## 目录结构
```shell
├── sbc-common                                    // common package.  
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder/common  // Specific code.  
│   ├── ├──resources
├── sbc-order                                     // order app                         :8181 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcorder         // Specific code.
│   ├── ├──resources
├── sbc-service                                   // eureka-server Registration center :8888 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/service/         // Specific code.
│   ├── ├──resources
├── sbc-user                                      // user app.                         :8080 port.
│   ├── src/main
│   ├── ├──java/com/crossoverJie/sbcuser/
│   ├── ├──resources
├── sbc-request-check                             // remove duplicates starter.
│   ├── src/main
│   ├── ├──com/crossoverJie/request/check         // Specific code. 
│   ├── ├──├──anotation                           // anotation package.
│   ├── ├──├──conf                                // Automate configuration-related code.
│   ├── ├──├──interceptor                         // Aspect.
│   ├── ├──├──properties                          // configuration.
│   ├── ├──resources
│   ├── ├──├──META-INF
│   ├── ├──├──├──spring.factories                 // Automated configuration files.
├── .gitignore                                    
├── LICENSE                
├── README.md               


```

## TODO LIST

* [x] [SpringBoot+SpringCloud初探](http://crossoverjie.top/2017/06/15/sbc1/)
* [x] [`Feign`声明式远程调用,`Eureka`高可用注册中心,`Swagger2`管理`REST API`](http://crossoverjie.top/2017/07/19/sbc2/)
* [x] [自定义`Starter-SpringBoot`重构去重插件](https://crossoverjie.top/2017/08/01/sbc3/)
* [x] [应用限流](https://crossoverjie.top/2017/08/11/sbc4/)。
* [ ] 通用的异常处理、日志插件、集成logback。
* [ ] 更多功能未完待续。。。

## Partial Screenshots
![https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg](https://ooo.0o0.ooo/2017/06/26/59511cef59d46.jpg)

---

![05.jpg](https://i.loli.net/2017/07/21/5970ea9544a8c.jpg)

---

![03.jpg](https://i.loli.net/2017/08/01/59803ca7d603d.jpg)

---

![令牌桶算法-来自网络.gif](https://i.loli.net/2017/08/11/598c91f2a33af.gif)

# Contact Author
- [crossoverJie@gmail.com](mailto:crossoverJie@gmail.com)

![weixinchat.jpg](https://i.loli.net/2017/07/21/5971592b04340.jpg)




