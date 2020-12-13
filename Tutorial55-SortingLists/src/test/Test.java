package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Machine implements Comparable<Machine> {
	private int id;
	private String task;

	public Machine(int id, String task) {
		this.id = id;
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
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

	@Override
	public int compareTo(Machine o) {
		// TODO Auto-generated method stub
		return -1;
	}

}

public class Test {

	public static void main(String[] args) {

		List<Machine> mach = new ArrayList<Machine>();
		SortedSet<Machine> set = new TreeSet<Machine>();

		addElements(mach);
		addElements(set);

		showElements(mach);
		showElements(set);

		/////////////////////////////////////////////////////////

		// Sorts alphabetical order letter
		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine m1, Machine m2) {
				return m1.getTask().compareTo(m2.getTask());
			}
		});

		showElements(mach);

		////////////////////////////////////////////////////////

		// Sorts from id lowest to highest
		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine o1, Machine o2) {
				Integer o = o1.getId();
				Integer e = o2.getId();
				return o.compareTo(e);
			}

		});

		showElements(mach);

		////////////////////////////////////////////////////////

		// Length of string
		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine o1, Machine o2) {

				if (o1.getTask().length() > o2.getTask().length()) {
					return -1;
				} else if (o1.getTask().length() < o2.getTask().length()) {
					return 1;
				} else {
					return o1.compareTo(o2);
				}

//			return o1.getTask().compareTo(o2.getTask());

			}

		});

		showTask(mach);

		////////////////////////////////////////////////////////

		// Sorts in negative order which sorted last time, or if you didnt sort it will
		// put it in opposite order of which added
		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine arg0, Machine arg1) {
				return -1;
			}

		});

		System.out.println(mach);

	}

	public static void addElements(Collection<Machine> test) {

		test.add(new Machine(0, "b"));
		test.add(new Machine(1, "fer"));
		test.add(new Machine(2, "ab"));
		test.add(new Machine(3, "rfd"));

	}

	public static void showElements(Collection<Machine> test) {
		for (Machine mach : test) {
			System.out.print(mach + ", ");
		}
		System.out.println();
	}

	public static void showTask(Collection<Machine> test) {
		for (Machine mach : test) {
			System.out.print(mach.getTask() + ", ");
		}
	}

}
