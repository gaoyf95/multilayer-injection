package com.gaoyf.multilayerinjection.event;

import com.gaoyf.multilayerinjection.entity.Student;
import com.gaoyf.multilayerinjection.entity.Teacher;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * Created by 高宇飞 on 2019/12/10 15:22:36
 * 事件列表
 */
@Configuration
public class CustomEventListener {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomEventListener.class);

    /**
     * 如果有多个监听器监听同一事件，我们可以在方法上使用spring的@order注解来定义多个监听器的顺序
     *
     * @param student
     *
     */
    @EventListener
    @Order(4)
    public void onApplicationEvent(Student student) {
        System.out.println("===> A 收到学生事件:学生姓名=" + student.getName());
    }

    @EventListener({Student.class, Teacher.class})
    @Order(3)
    public void onApplicationEvent3(Object event) {
        if (event instanceof Student) {
            System.out.println("===> B 收到学生事件:学生姓名=" + ((Student) event).getName());
        } else if (event instanceof Teacher) {
            Teacher teacher = (Teacher) event;
            System.out.println("===> B 收到老师事件:老师姓名=" + teacher.getName());
        }
    }
}
