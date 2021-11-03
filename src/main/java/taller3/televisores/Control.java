package taller3.televisores;

public class Control {
	TV tv;
	
	

	public TV getTv() {return tv;}

	public  turnOn() {tv.turnOn();}
	public  turnOff() {tv.turnOff();}
	
	public  volumenUp() {tv.volumenUp();}
	public  volumenDown() {tv.volumenDown();}

	public void canalUp() {tv.canalUp();}
	public void canalDown() {tv.canalDown();}
	
	public void setCanal(int canal) {tv.setCanal(canal);}
	public void setTv(TV tv) {this.tv = tv;}
	

}