package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.dao.StudentDAO;
import com.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/jdbc.xml");
//        JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemplate");
//        
//        //insert query
//        String query = "insert into student(id,name,city) values(?,?,?)";
//        
//        //fire query
//        int result = temp.update(query, 5, "Pooja", "Mumbai");     
//        System.out.println("Number of record inserted: "+result);
//        
//        System.out.println("Program ended");
        
        StudentDAO s = (StudentDAO) context.getBean("studentDao");
        
        //inserting new
//        Student s1 = new Student();
//        s1.setId(10);
//        s1.setName("Satyam");
//        s1.setCity("Bhopal");
//        
//        int result = s.insert(s1);
//        System.out.println("Student added "+result);
        
        //Update
//        Student s1 = new Student();
//        s1.setId(2);
//        s1.setName("Satyam");
//        s1.setCity("Bhopal");
//        
//        int result = s.change(s1);
//        System.out.println("Data Changed "+result);
        
        //Delete
        int result = s.delete(5);
        System.out.println(result);
    }
}
