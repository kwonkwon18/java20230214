package ch08.excercise.exam07;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB검색");

	}

	@Override
	public void insert() {
		System.out.println("Mysql DB삽입");

	}

	@Override
	public void update() {
		System.out.println("Mysql DB수정");

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB삭제");

	}

}
