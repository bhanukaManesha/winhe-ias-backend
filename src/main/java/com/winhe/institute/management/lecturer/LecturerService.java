package com.winhe.institute.management.lecturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.winhe.institute.management.util.jsonwrapper.JsonWrapper;

@Service
public class LecturerService {

	@Autowired
	private LecturerRepository lecturerRepository;

	public JsonWrapper getAllLecturers() {

		JsonWrapper data = new JsonWrapper("LECTURER200", "List of All the lecturers", lecturerRepository.findAll());

		return data;
	}

	public JsonWrapper getLecturer(String id) {
		Lecturer lecturer = lecturerRepository.findOne(Long.valueOf(id));

		if (lecturer == null) {
			JsonWrapper data = new JsonWrapper("LECTURER404", "ERROR", "No Lecturer Found");
			return data;
		}

		JsonWrapper data = new JsonWrapper("LECTURER200", "Lecturer Found", lecturer);
		return data;
	}
	
	// method of adding a lecturer
	public JsonWrapper addLecturer(Lecturer lecturer) {
		
		lecturerRepository.save(lecturer);
		
		JsonWrapper data = new JsonWrapper("LECTURER200", "SUCCESSFULLY ADDED", lecturer);
	
		return data;
	}
	
	// method of updating a lecturer
	
	
	public JsonWrapper updateLecturer(Long id,  Lecturer lecturer) {

		Lecturer tempLecturer = lecturerRepository.findOne(id);

		if (tempLecturer== null) {
			JsonWrapper data = new JsonWrapper("LECTURER404", "ERROR , No Lecturer Entry Found");
			return data;
		}

		lecturer.setId(id);
		lecturerRepository.save(lecturer);
		
		JsonWrapper data = new JsonWrapper("LECTURER200", "Lecturer Entry Successfully Updated", lecturer);

		return data;
	};
	
	// method of deleting a lecturer
	public JsonWrapper deleteLecturer(Long id) {

		Lecturer tempLecturer = lecturerRepository.findOne(id);

		if (tempLecturer == null) {
			JsonWrapper data = new JsonWrapper("LECTURER404", "ERROR , No Lecturer Entry Found");
			return data;
		}

		lecturerRepository.delete(id);

		JsonWrapper data = new JsonWrapper("LECTURER200", "SUCCESFULLY DELETED");

		return data;
	};
	
}
