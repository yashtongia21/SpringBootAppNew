package com.verizon.bsa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.verizon.bsa.model.Emp;

@Repository
public class EmpDaoInMemoryImpl implements EmpDao {
	
Map<Integer,Emp> emps;
	
	public EmpDaoInMemoryImpl() {
		emps = new TreeMap<>();
		
		emps.put(101,  new Emp(101,"First",50,50,"HR"));
		emps.put(102,  new Emp(102,"Second",50,50,"HR"));
	}
	@Override
	public Emp addEmp(Emp emp) {
		
		return emps.put(emp.getEmpid(), emp);
	}

	@Override
	public Emp updateEmp(Emp emp) {
		return emps.replace(emp.getEmpid(), emp);
	}

	@Override
	public Emp getEmpById(int empid) {
		return emps.get(empid);
	}

	@Override
	public boolean deleteEmpById(int empid) {
		boolean isDeleted=false;
		if(emps.containsKey(empid)) {
			emps.remove(empid);
			isDeleted=true;
		}
		
		return isDeleted;
	}

	@Override
	public List<Emp> getAllEmps() {
		return new ArrayList<Emp>(emps.values());
	}


}
