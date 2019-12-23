package com.softwarica.employeeapi.API;

import com.softwarica.employeeapi.Models.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID(@Path("empID") int empId);
}
