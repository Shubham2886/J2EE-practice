package compare.com;

public class emp  {

	
	private int id;
	
	private String name;
	
	private String branch;
	
//	@Override
//	public int compareTo(emp o) {
//		
//			return this.getName().compareTo(o.getName());
//	}
//	
	
	public emp(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}


	
}
