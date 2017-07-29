import org.frameworkset.task.TaskService;

/**
 * 调试作业任务
 */
public class TestTask {
    public static void main(String[] args){
        /**
         * 启动quartz作业引擎
         */
        TaskService.getTaskService().startService();

    }
}
