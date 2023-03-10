package ch13.sec02;

// 제네릭 타입
public class Product<K, M> {
	// 필드
	private K kind;
	private M model;

	// 메서드
	public K getKind() {
		return kind;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}
