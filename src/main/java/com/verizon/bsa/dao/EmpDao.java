package com.verizon.bsa.dao;

import java.util.List;

import com.verizon.bsa.model.Book;
import com.verizon.bsa.model.Emp;

public interface EmpDao {
	
	Emp addEmp(Emp emp);
	Emp updateEmp(Emp emp);
	Emp getEmpById(int empid);
	boolean deleteEmpById(int empid);
	List<Emp> getAllEmps();


}
