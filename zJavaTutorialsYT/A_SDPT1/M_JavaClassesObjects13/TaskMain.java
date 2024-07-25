package M_JavaClassesObjects13;

public class TaskMain {

	public static void main(String[] args) {
		
		TaskObject tObj = new TaskObject();
		
		tObj.maxHealth = 100;
		tObj.minHealth = 50;
		
		tObj.gunName = "MP4";
		tObj.name = "Rocky123";
		tObj.dead = true;
		
		System.out.println(tObj.name);
		
	}

}
