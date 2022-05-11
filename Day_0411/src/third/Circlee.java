package third;

public class Circlee implements Calculate {
	private int radius;
	

	public Circlee() {
	}

	public Circlee(int radius) {
		this.radius = radius;
		

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public String toString() { //멤버 변수를 스트링으로 만든다. 굳이 없어도 되는데 나중에 오류찾거나 할 때 필요!!
		return "radius=" + radius;
	}

	@Override // 인터페이스에서 만들라고 한 규격을 수정하는게 오버라이드
	public double area() {
		return (this.radius * this.radius * PI); //인터페이스에 pi가 정해져 있는값이니까 따로 또 this안써도 된다!

	}

	@Override
	public void print() {
		System.out.println("radius=" + radius + "area = " + this.area());
	}

}
