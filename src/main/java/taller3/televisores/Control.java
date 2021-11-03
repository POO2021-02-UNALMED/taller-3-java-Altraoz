package taller3.televisores;

public class Control {
	TV tv;
	
	

	public TV getTv() {return tv;}

	public  turnOn() {tv.turnOn();}
	public  turnOff() {tv.turnOff();}
	
	public  volumenUp() {tv.volumenUp();}
	public  volumenDown() {tv.volumenDown();}

	public  canalUp() {tv.canalUp();}
	public  canalDown() {tv.canalDown();}
	
	public  setCanal(int canal) {tv.setCanal(canal);}
	public  setTv(TV tv) {this.tv = tv;}
	

}