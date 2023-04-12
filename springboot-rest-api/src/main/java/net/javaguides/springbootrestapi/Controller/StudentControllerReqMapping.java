package net.javaguides.springbootrestapi.Controller;

import net.javaguides.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("studentReqMap")
public class StudentControllerReqMapping {

    //http://localhost:8080/studentReqMap
    @GetMapping("studentsData")
    public ResponseEntity<Student> getStudent(){
        Student student =  new Student(
                1, "SamRe", "MarvinRM"
        );

//        return new ResponseEntity<>(student, HttpStatus.FOUND);
//        return ResponseEntity.ok(student);
        return ResponseEntity.ok()
                .header("custom--header" , "This is Custom message")
                .body(student);


    }

    //Output is lits - JSON
    //http://localhost:8080/studentREsList
    @GetMapping
    public ResponseEntity<List<Student>> getStudents()
    {
        List<Student> students =  new ArrayList<>();
        students.add(new Student(1," Sam ", "MarvinRE"));
        students.add(new Student(2, "Antoine" ,"bartRE"));
        students.add(new Student(3, "Eric" ,"boRE"));

        return ResponseEntity.ok(students);
    }

    // Spring Boot REST api with Path variables
    // { id} = URI template variable
    // http://localhost:8080/studentReqMap/1
    // http://localhost:8080/studentReqMap/1/ramesh/v
    @GetMapping("{id}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId)
    {
        Student stu =  new Student(studentId, "Sam" , "VRe");
        return ResponseEntity.ok(stu);
    }

    // http://localhost:8080/studentReqMap/1/ramesh/v
    @GetMapping("{id}/{FirstNm}/{LastNm}")
    public ResponseEntity<Student> studentPathVariables(@PathVariable("id") int studentId,
                                        @PathVariable("FirstNm") String firstName,
                                        @PathVariable("LastNm") String lastName
                                        )
    {
        Student stu =new Student(studentId, firstName , lastName);

        return ResponseEntity.ok(stu);
    }

    //Spring boot REST API with request Params
    // http://localhost:8080/studentReqMap/query?id=1
    @GetMapping("query")
    public  ResponseEntity<Student> studentReuqestVariable(@RequestParam int id)
    {
        Student stu = new Student(1, "Sam", "VanRE");
        return ResponseEntity.ok(stu);
    }

    // http://localhost:8080/studentReqMap/query1?id=1&name=Sam&lnm=Van
    @GetMapping("query1")
    public  ResponseEntity<Student> studentReuqestVariables(@RequestParam int id,
                                            @RequestParam String name,
                                            @RequestParam String lnm
                                            )
    {
        Student stu = new Student(1, name, lnm);
        return ResponseEntity.ok(stu);
    }

    //SPRING boot REST API that handles HTTP POST Request - create new resource
    //http://localhost:8080/studentReqMap/create
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public  ResponseEntity<Student> createStudent(@RequestBody Student stu)
    {
        System.out.println(stu.getId() + " " +  stu.getFirstName() + " "  + stu.getLastName());
        return ResponseEntity.ok(stu);
    }
//
    //Spring BOOT Rest Api for HTTP PUT request - updating old resource
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,
                                 @PathVariable("id") int studentId)
    {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);

    }

    @DeleteMapping("{id}/delete")
    public String deleteStudent(@PathVariable("id") int stuId)
    {
        System.out.println();
        return "Student deleted";
    }
}
