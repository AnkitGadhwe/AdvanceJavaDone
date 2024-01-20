package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.model.XYZCompany;

public interface DaoInterface {

	boolean save(String empno, LocalDate startDate, LocalDate endDate, String lt, String lr);

	List<XYZCompany> DisplayLeaveDetail();

	

}
