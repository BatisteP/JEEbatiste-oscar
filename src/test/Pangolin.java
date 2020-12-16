package test;

public class Pangolin {



	private String birthday;
	private String user;

	public Pangolin(String user, String birthday) {
		this.setUser(user);
		this.setBirthday(birthday);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
