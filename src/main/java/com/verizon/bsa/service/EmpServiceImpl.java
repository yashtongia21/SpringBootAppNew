package com.verizon.bsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.bsa.dao.BookDao;
import com.verizon.bsa.dao.EmpDao;
import com.verizon.bsa.model.Book;
import com.verizon.bsa.model.Emp;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDao empDao;
	
	@Override
	public Emp addEmp(Emp emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public Emp updateEmp(Emp emp) {
		return empDao.updateEmp(emp);
	}

	@Override
	public Emp getEmpById(int empid) {
		return empDao.getEmpById(empid);
	}

	@Override
	public boolean deleteEmpById(int empid) {
		return empDao.deleteEmpById(empid);
	}

	@Override
	public List<Emp> getAllEmps() {
		return empDao.getAllEmps();
	}


}
