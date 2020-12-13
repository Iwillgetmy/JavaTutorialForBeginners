import java.io.Serializable;

//Serializing arrays is quite similar as serializing normal objects

//Make sure that before you run the read program, you have ran the updated version of the write program

public class Machine implements Serializable {

	private int id;
	private String name;

	public Machine(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + "]";
	}

}