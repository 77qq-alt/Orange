# Orange
一款基于springboot的校园的在线微信小程序接单+校园墙平台
学校的学生能够基于小程序进行在线的派单（如快递代拿，外卖代拿，带买服务），
学生可以在线接单并且得到一些交易信息。
同时提供校园墙的功能，通过”橙币”能够购买一定时间的“广告效果”，如：
社团招新，创业找合伙人，情侣表白等服务。
技术栈：
Nacos作配置中心服务发现，使得配置一更新，项目的一些默认参数也得到实时的更新，sentinel熔断降级，
集成java8新特性
springboot+springMVC+mybaits-plus+easyCode生成原子服务层接口操作数据库
使用hutool工具包简化开发，使用Assert进行异常处理
使用redis，维护订单列表等信息，并且对value使用json方式存储，
统一提供对外的api接口
自定义RedisUtil等......

本项目的环境搭建如下：
Linux下JDK，MySQL，Nacos，Sentinel，Redis的搭建可参考本人的CSDN
https://blog.csdn.net/pzzzz_wwy/category_10638289.html


项目正在开发中，会持续进行更新...



记录一下搭建框架以及环境的时候的小坑：
1.尽量使用spring Initializr搭建项目 而且注意springboot的版本是否支持alibaba！ 很容易出现版本不兼容的问题！
2.nacos-config的时候 错将配置文件弄成了discovery 服务发现的配置文件
3.nacos刷新配置不生效 --- 暂未解决  目前仅重启nacos生效 ，网上说原因是因为cglib代理了两次，也有说要用专门的配置类。暂时搁置！ ---目前已解决，莫名其妙的成功了后来
4.变量读取nacos上的配置不能使用static修饰，不然读取到的值为null
5.使用redis存储在线订单的时候，如果使用hash来维护，那么hash里面的key的值是无法进行设置过期时间的（过期时间只能设置给顶级的key），于是我改成了使用string来维护在线订单列表
