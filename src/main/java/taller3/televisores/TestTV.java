package taller3.televisores;

public class TestTv {
	public static void main(String[] args) {
		Marca m1 = new Marca("LGsus");
	    Marca m2 = new Marca("Akalley");
	    TV tele1 = new TV(m1, true);
	    TV tele2 = new TV(m2, false);
		Control control = new Control();
		control.enlazar(tele1);
	    tele1.setPrecio(500000);
	    tele2.setCanal(10);
		control.turnOff();
		control.setCanal(20);
		control.turnOn();
		tele2.setVolumen(15);
		control.canalUp();
		control.volumenUp();
		System.out.println(tele1.getPrecio());
	    System.out.println(tele2.getCanal());
		System.out.println(tele1.getCanal());
	    System.out.println(tele1.getMarca().getNombre());
	}
}