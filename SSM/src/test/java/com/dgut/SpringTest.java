package com.dgut;

import com.dgut.domain.Worker;
import com.dgut.service.WorkerService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        WorkerService workerService = (WorkerService) applicationContext.getBean("workerServiceImpl");
        List<Worker> all = workerService.findAllWorker();
        for (Worker worker : all) {
            System.out.println(worker);
        }
    }
}
