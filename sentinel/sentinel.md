#下载sentinel
https://github.com/alibaba/Sentinel/releases

#启动sentinel

java -jar sentinel-dashboard-1.7.2.jar &  

说明： 在末尾加入 & 符号

#访问地址
localhost:8080
用户名/密码 sentinel/sentinel

#问题

```
2020-05-14 02:05:36.729 ERROR 1772 --- [pool-2-thread-1] c.a.c.s.dashboard.metric.MetricFetcher   : Failed to fetch metric from <http://169.254.112.249:8719/metric?startTime=1589436201000&endTime=1589436207000&refetch=false> (ConnectionException: Connection timed out)
```

解决方法

在启动类添加检查心跳的地址

```
System.setProperty(TransportConfig.HEARTBEAT_CLIENT_IP, "172.20.10.4");
```

# 流控规则

![image-20200514142254416](images\image-20200514142254416.png)

规则说明

![image-20200514144940920](images\image-20200514144940920.png)

![image-20200514154501203](images\image-20200514154501203.png)

# 降级规则

![image-20200514162213450](images\image-20200514162213450.png)

![image-20200514162308490](images\image-20200514162308490.png)

RT

![image-20200514162656263](images\image-20200514162656263.png)

异常比例

![image-20200514165259771](images\image-20200514165259771.png)

异常数

![image-20200514170700960](images\image-20200514170700960.png)

# 系统规则

![image-20200515110620858](images\image-20200515110620858.png)