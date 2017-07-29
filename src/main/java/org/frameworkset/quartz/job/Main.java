package org.frameworkset.quartz.job;

import org.frameworkset.task.TaskService;

/**
 * bboss微服务主程序
 */
public class Main {
    public static void main(String[] args){
        //启动定时任务quartz引擎
        TaskService.getTaskService().startService();
    }
}
