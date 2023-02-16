package cn.itcast.controller;

import cn.itcast.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;

    @Value("${server.port}")
    private Integer port;

    @Value("${enterprise.subject[0]}")
    public String subject_00;


    @Autowired
    private Environment environment;


    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
//        System.out.println("id ==> " + id);
        System.out.println("lesson = " + lesson);
        System.out.println("port = " + port);
        System.out.println("subject_00 = " + subject_00);
        System.out.println("----------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(environment.getProperty("enterprise.subject[0]"));
        System.out.println("----------------");
        System.out.println("enterprise = " + enterprise);

        return "hello,spring boot!";
    }
}
