package net.javaguides.employeeservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.APIResponseDto;
import net.javaguides.employeeservice.dto.DepartmentDto;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import net.javaguides.employeeservice.repositories.EmployeeRepository;
import net.javaguides.employeeservice.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
//    private RestTemplate restTemplate;
    private WebClient webClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail(),
                employeeDto.getDepartmentCode()
        );

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = new EmployeeDto(
                saveDEmployee.getId(),
                saveDEmployee.getFirstName(),
                saveDEmployee.getLastName(),
                saveDEmployee.getEmail(),
                saveDEmployee.getDepartmentCode()
        );

        return savedEmployeeDto;
    }

    @Override
    public APIResponseDto getEmployeeById(Long employeeId) {
        Employee employee =  employeeRepository.getReferenceById(employeeId);

//        //RestTemplate
//        ResponseEntity<DepartmentDto> responseEntity =  restTemplate.getForEntity("http://localhost:8080/api/department/" + employee.getDepartmentCode(),
//                DepartmentDto.class           );
//        DepartmentDto departmentDto = responseEntity.getBody();

        //WebClient
        DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/api/department/" + employee.getDepartmentCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();

        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartmentCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployee(employeeDto);
        apiResponseDto.setDepartment(departmentDto);
        return apiResponseDto;
    }

}
