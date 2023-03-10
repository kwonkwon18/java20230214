package ch12.excercise;

import java.util.Objects;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(this.studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student student) {
			if (studentNum.equals(getStudentNum())) {
				return true;
			}
		}
		return false;

	}

}
