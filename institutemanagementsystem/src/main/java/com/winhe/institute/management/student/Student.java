package com.winhe.institute.management.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.winhe.institute.management.associate.student_batch.Student_Batch;
import com.winhe.institute.management.associate.student_course.Student_Course;
import com.winhe.institute.management.guardian.Guardian;
import com.winhe.institute.management.studentAttendance.StudentAttendance;

@Entity
public class Student {

	@Id
	@SequenceGenerator(name="student_generator", sequenceName="student_seq", allocationSize = 1, initialValue = 1000)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="student_generator")
	private Long id;
	private String firstName;
	private String lastName;
	private String NIC_BC;
	@Temporal(TemporalType.DATE)
	private Date DOB;
	private String gender;
	private String nationality;
	private String race;
	private String status;
	private String emailAddress;
	private String address;
	private String homeNo;
	private String mobileNo;
	private String year10_nameOfQualification;
	private String year10_subjectsPassed;
	private String year12_nameOfQualification;
	private String year12_subjectsPassed;
	private String otherQualifications;
	private String studyTime;
	private Boolean current_past;
	
	
	@ManyToOne
	private Guardian guardian;
	
	@OneToMany(mappedBy="student")
	private Student_Course student_course;

	@OneToMany(mappedBy="student")
	private Student_Batch student_batch;
	
	@OneToMany(mappedBy="student")
	private StudentAttendance studentAttendance;
	
	@OneToMany
	
}
