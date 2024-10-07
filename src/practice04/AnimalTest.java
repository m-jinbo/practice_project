package practice04;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog("ポチ", 2, "白");
		dog.showInfo();
		dog.cry();

		System.out.println("--------------------");

		Sparrow sparrow = new Sparrow("チュン", 1, true);
		sparrow.showInfo();
		sparrow.cry();
	}
}
