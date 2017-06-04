package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.pool.T1000Pool;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        ModelT1000 model1 = (ModelT1000) context.getBean("model1");
        ModelT1000 model2 = (ModelT1000) context.getBean("model2");


        // BaseModel baseModel = (BaseModel) context.getBean("baseModel");

        // RobotConveyor t1000Conveyor = (RobotConveyor)
        // context.getBean("t1000Conveyor");
        //
        // Robot terminator1 = t1000Conveyor.createRobot();
        // Robot terminator2 = t1000Conveyor.createRobot();
        // Robot terminator3 = t1000Conveyor.createRobot();
        //

        model1.action();
        model2.action();

        System.out.println(model1);
        System.out.println(model2);
        // System.out.println("terminator2 " + terminator2);
        // System.out.println("terminator3 " + terminator3);
        //
        // terminator1.action();

        //T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        //t1000Pool.action();

    }
}
