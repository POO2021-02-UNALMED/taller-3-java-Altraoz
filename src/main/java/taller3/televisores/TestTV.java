package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Semsung");
	    Marca marca2 = new Marca("Lj");
	    TV tv1 = new TV(marca1, true);
	    TV tv2 = new TV(marca2, false);
		Control control1 = new Control();
	    tv1.setPrecio(1000000);
		control1.canalUp();
		control1.volumenUp();
	    tv2.setCanal(73);
		control1.enlazar(tv1);
		control1.setCanal(34);
	    tv1.setCanal(25);
		tv2.setVolumen(9);
		control1.setCanal(14);
		control1.turnOff();
		control1.volumenUp();
		control1.setCanal(94);
		control1.canalUp();
		control1.setCanal(58);
		control1.turnOn();

	    System.out.println(tv2.getCanal());
		System.out.println(tv1.getMarca().getNombre());
		System.out.println(tv1.getCanal());
	    System.out.println(tv1.getPrecio());


	}
}