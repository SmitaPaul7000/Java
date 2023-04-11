package net.javaguides.springbootrestapi.Controller;

import net.javaguides.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent(){
        Student student =  new Student(
                1, "Sam", "Marvin"
        );

        return student;
    }

    //Output is lots - JSON
    @GetMapping("studentsList")
    public List<Student> getStudents()
    {
        List<Student> students =  new ArrayList<>();
        students.add(new Student(1," Sam ", "Marvin"));
        students.add(new Student(2, "Antoine" ,"bart"));
        students.add(new Student(3, "Eric" ,"bo"));

        return students;
    }

    // Spring Boot REST api with Path variables
    // { id} = URI template variable
    // http://localhost:8080/students/1
    // http://localhost:8080/students/1/ramesh/v
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId)
    {
        return new Student(studentId, "Sam" , "V");
    }

    // http://localhost:8080/students/1/ramesh/v
    @GetMapping("students/{id}/{FirstNm}/{LastNm}")
    public Student studentPathVariables(@PathVariable("id") int studentId,
                                        @PathVariable("FirstNm") String firstName,
                                        @PathVariable("LastNm") String lastName
                                        )
    {
        return new Student(studentId, firstName , lastName);
    }

    //Spring boot REST API with request Params
    // http://localhost:8080/students/query?id=1
    @GetMapping("students/query")
    public  Student studentReuqestVariable(@RequestParam int id)
    {
        return new Student(1, "Sam", "Van");
    }

    // http://localhost:8080/students/query?id=1&name=Sam&lnm=Van
    @GetMapping("students1/query")
    public  Student studentReuqestVariables(@RequestParam int id,
                                            @RequestParam String name,
                                            @RequestParam String lnm
                                            )
    {
        return new Student(1, name, lnm);
    }

    //SPRING boot REST API that handles HTTP POST Request - create new resource
    //http://localhost:8080/student/create
    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public  Student createStudent(@RequestBody Student stu)
    {
        System.out.println(stu.getId() + " " +  stu.getFirstName() + " "  + stu.getLastName());
        return stu;
    }

    //Spring BOOT Rest Api for HTTP PUT request - updating old resource
    @PutMapping("student/{id}/update")
    public Student updateStudent(@RequestBody Student student,
                                 @PathVariable("id") int studentId)
    {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;

    }

    @DeleteMapping("student/{id}/delete")
    public String deleteStudent(@PathVariable("id") int stuId)
    {
        System.out.println();
        return "Student deleted";
    }
}
