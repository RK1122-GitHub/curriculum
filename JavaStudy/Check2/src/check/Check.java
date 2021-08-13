package check;

import constants.Constants;

public class Check {

	private static String firstName = "亮我";
	private static String lastName = "笠川";

	public static void main(String[] args) {

		// printNameメソッドを使用し、名前を表示
		System.out.println("printNameメソッド → " + printName(firstName, lastName));

		// Petクラスをインスタンス化
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		// petクラスのintroduceメソッドを使用
		pet.introduce();

		// RobotPetクラスをインスタンス化
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		// RobotPetクラスのintroduceメソッドを使用
		robotPet.introduce();
	}
	
	//printNameメソッド
	private static String printName(String first_Name, String last_Name) {
		String name = last_Name + first_Name;
		return name;
	}
}
