package test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Machine {

	private int id;
	private String task;

	public Machine(int id, String task) {
		super();
		this.id = id;
		this.task = task;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", task=" + task + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		if (id != other.id)
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}
}

public class Test {

	public static void main(String[] args) {

		Machine m1 = new Machine(1, "clean");
		Machine m2 = new Machine(2, "cook");
		Machine m3 = new Machine(3, "security");
		Machine m4 = new Machine(3, "security");

		// You can't use a treemap for maps, when using original elements, unless you
		// define natural order
		Map<Machine, Integer> map = new LinkedHashMap<Machine, Integer>();

		map.put(m1, 1);
		map.put(m2, 2);
		map.put(m3, 3);
		map.put(m4, 4);

		// Prints it in automatically defined way
		for (Map.Entry<Machine, Integer> maps : map.entrySet()) {
			System.out.println(maps);
		}

		System.out.println();

		// This way allows you to outprint key and value in your own way
		for (Machine key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

		System.out.println();

		Set<Machine> set = new LinkedHashSet<Machine>();

		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);

		System.out.println(set);

	}

}
