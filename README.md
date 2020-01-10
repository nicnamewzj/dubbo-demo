# dubbo-demo
dubbo 入门

1：当服务越来越多，服务url配置管理变得越来越困难，F5硬件负载均衡单点压力越来越大

此时需要一个注册中心，动态的实现服务注册与发现，使得服务参数透明化。并通过在服务消费方获取服务提供方地址列表，实现软负载均衡和Failover(失败重试)。降低对F5硬件均衡器的依赖，也能减少部分成本。

2：当进一步发展，服务间的依赖关系变得错综复杂，甚至分不清哪个应用要在哪个应用之前启动，架构师都不能完整的描述服务间的依赖关系。
这时，需要自动画出应用间的关系图，以帮助架构师理清依赖关系。

3：服务调用量越来越大，服务的容量问题就暴露出来了，这个服务需要多少机器支撑？什么时候需要增加机器？

为了解决这些问题，第一步，要将服务现在每天的调用量，响应时间都统计出来，作为容量规划的参数指标。其次，要可以动态的调整权重，在线上可以通过加大一台机器的权重值，记录服务的响应时间变化，直到达到阀值。记录此时的访问量，再以此访问量乘以机器数，反推服务总容量。



小插曲：
githuab 添加 ssh key:

1: 检查本地是否存在SSH KEY:
cd ~/.ssh
ll 或 ls
看是否存在id_rsa 和 id_rsa.pub,如果已经存在，说明已经有SSH KEY

2: 若没有，则需要生成:
ssh-keygen -t rsa -C "1162028261@qq.com"

3:获取SSH KEY:
cat id_rsa.pub

4:拷贝SSH KEY 添加到自己的github账号:

5：验证是否成功：
ssh -T git@github.com
出现如下结果，则成功：
Hi nicknamewzj! You've successfully authenticated, but GitHub does not provide shell access.

小插曲2：
git 修改查看文件权限：
1：查看文件权限：
git ls-tree HEAD

2: 修改文件权限：
git update-index --chmod=+x xxx.sh
