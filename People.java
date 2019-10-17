package test;

public class People {
	private String nim, name;
	
	public People(String nim, String name){
		this.setNim(nim);
		this.setName(name);
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
