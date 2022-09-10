package quiz2;

public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
		}
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
	    this.filled = filled;
	    }
	  public String getColor() {
		  return color;
		  }
	  public void setColor(String color) {
		  this.color = color;
		  }
	  public boolean isFilled() {
		  return filled;
		  }
	  public void setFilled(boolean filled) {
		  this.filled = filled;
		  }
	  public java.util.Date getDateCreated() {
		  return dateCreated;
		  }
	  public String toString() {
		  return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		  }
	  }

class Square extends SimpleGeometricObject {
	private static int side;
	
	public static int getSide() {
		return side;
		}
	public static void setSide(int side) {
		Square.side = side;
		}
	public Square() {}
	
	public void takeInput() {
	this.setFilled(isFilled());
	this.setColor(getColor());
	Square.setSide(getSide());
	this.getDateCreated();
	}
	
	public String toString() {
		return "all relevant info is" + side + super.getColor() + super.isFilled() + super.getDateCreated();
	}
	public int getPerimeter() {
		return 4 * side;
	}
	public static void main(String[] args) {
		Square sq1 = new Square();
		sq1.setColor("Pink");
		sq1.getDateCreated();
		Square.setSide(4);
		sq1.setFilled(false);
		sq1.getPerimeter();
		
		Square sq2 = new Square();
		sq2.setColor("Red");
		sq2.getDateCreated();
		Square.setSide(8);
		sq2.setFilled(true);
		sq1.getPerimeter();
	}
}
