#quartz作业demo
基于quartz 2.3.0，定期清理es索引数据


# 构建部署
前提：安装和配置好最新的gradle版本，下载源码
## 利用gradle构建发布版本
gradle releaseVersion

## 运行作业
gradle构建成功后，在build/distributions目录下会生成可以运行的zip包，解压后启动和运行quartz作业即可：


linux：

chmod +x startup.sh

./startup.sh

windows: startup.bat


