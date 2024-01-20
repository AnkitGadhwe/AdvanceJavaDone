package com.demo.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XYZ")
public class XYZCompany {
@Id
@Column(length=10)
private String Leave_id;
private LocalDate leave_start;
private LocalDate leave_end;
@Column(length=25)
private String leave_type;
@Column(length=25)
private String leave_reason;
@Override
public String toString() {
	return "XYZCompany [Leave_id=" + Leave_id + ", leave_start=" + leave_start + ", leave_end=" + leave_end
			+ ", leave_type=" + leave_type + ", leave_reason=" + leave_reason + "]";
}
public String getLeave_id() {
	return Leave_id;
}
public void setLeave_id(String leave_id) {
	Leave_id = leave_id;
}
public LocalDate getLeave_start() {
	return leave_start;
}
public void setLeave_start(LocalDate leave_start) {
	this.leave_start = leave_start;
}
public LocalDate getLeave_end() {
	return leave_end;
}
public void setLeave_end(LocalDate leave_end) {
	this.leave_end = leave_end;
}
public String getLeave_type() {
	return leave_type;
}
public void setLeave_type(String leave_type) {
	this.leave_type = leave_type;
}
public String getLeave_reason() {
	return leave_reason;
}
public void setLeave_reason(String leave_reason) {
	this.leave_reason = leave_reason;
}
public XYZCompany(String leave_id, LocalDate leave_start, LocalDate leave_end, String leave_type, String leave_reason) {
	super();
	Leave_id = leave_id;
	this.leave_start = leave_start;
	this.leave_end = leave_end;
	this.leave_type = leave_type;
	this.leave_reason = leave_reason;
}
public XYZCompany() {
	super();
}
}

