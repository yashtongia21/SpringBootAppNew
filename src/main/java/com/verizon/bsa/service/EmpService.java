package com.verizon.bsa.service;

import java.util.List;


import com.verizon.bsa.model.Emp;

public interface EmpService {
	Emp addEmp(Emp emp);
	Emp updateEmp(Emp emp);
	Emp getEmpById(int empid);
	boolean deleteEmpById(int empid);
	List<Emp> getAllEmps();
}
