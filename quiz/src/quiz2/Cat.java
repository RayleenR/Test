package quiz2;

public class Cat {
	static String catName;
	static int catAge;
	static String catBreed;
	static String favoriteFood;
	
	public static String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		Cat.catName = catName;
	}
	public static int getCatAge(){
		return catAge;
	}
	public void setCatAge(int catAge) {
		Cat.catAge = catAge;
	}
	public static String getCatBreed() {
		return catBreed;
	}
	public void setCatBreed(String catBreed) {
		Cat.catBreed = catBreed;
	}
	public static String getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		Cat.favoriteFood = favoriteFood;
	}
	
	public static void catInfo() {
		System.out.println("Cat Name: " + getCatName());
		System.out.println("Cat Age: " + getCatAge());
		System.out.println("Cat Breed: " + getCatBreed());
		System.out.println("Favorite Food: " + getFavoriteFood());	
	}
	public static void main(String [] args) {
		Cat c1 = new Cat();
		c1.setCatName("Randy");
		c1.setCatAge(7);
		c1.setCatBreed("Bengal");
		c1.setFavoriteFood("Fish");
		catInfo();
		
		Cat c2 = new Cat();
		c2.setCatName("Bob");
		c2.setCatAge(3);
		c2.setCatBreed("Persian");
		c2.setFavoriteFood("Meat");
		catInfo();
	}
}
