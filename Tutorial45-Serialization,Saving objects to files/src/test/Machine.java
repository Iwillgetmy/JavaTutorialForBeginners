package test;

import java.io.Serializable;

public class Machine implements Serializable{

	//Serial ID
	private static final long serialVersionUID = 6291167735685832691L;
	
	private int id;
	private String type;

	public Machine(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + "]";
	}
}
