package com.giriharan.Project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.giriharan.Project1.service.ShapeService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCtxt = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = (ShapeService)appCtxt.getBean("shapeService");
        shapeService.getCircle().setName("c2");
        System.out.println("Circle Name = "+shapeService.getCircle().getName());
        System.out.println("Triangle Name = "+shapeService.getTriangle().getName());
        shapeService.getCircle().setAndReturnName("test");
        shapeService.getTriangle().setAndReturnName("1");
    }
}
