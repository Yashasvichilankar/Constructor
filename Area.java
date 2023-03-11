
public class Area {

	Area(int l,int b){
		int Area=l*b;
		System.out.println("Area of rectangle: "+Area);
	}
	Area(int n){
		int area=n*n;
		System.out.println("Area of Square is: "+area);
	}
	public static void main(String[] args) {
		Area a1=new Area(2,3);
		Area a2=new Area(2);
	}
}
