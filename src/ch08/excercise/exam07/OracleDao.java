package ch08.excercise.exam07;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 DB검색");

	}

	@Override
	public void insert() {
		System.out.println("오라클 DB삽입");

	}

	@Override
	public void update() {
		System.out.println("오라클 DB수정");

	}

	@Override
	public void delete() {
		System.out.println("오라클 DB삭제");

	}

}
