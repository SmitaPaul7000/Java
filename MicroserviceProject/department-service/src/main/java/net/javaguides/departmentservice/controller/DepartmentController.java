package net.javaguides.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController {

    //Inject dependencies
    private DepartmentService departmentService;

    //Build save department REST API
    //http://localhost:8080/api/department
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartmnet(@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto saveDept = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(saveDept, HttpStatus.CREATED);
    }

    //Build GET department REST API
    //http://localhost:8080/api/department/IT0012
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode)
    {
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return  new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }

}
