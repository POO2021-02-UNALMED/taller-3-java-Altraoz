package taller3.televisores;

public class TV {

	private Marca marca; private int canal = 1; private int precio = 500; private int volumen = 1;
	private boolean estado; private Control control; private static int totalTVs;

	public TV(Marca marca,boolean estado) {this.marca = marca;this.estado = estado;totalTVs = totalTVs + 1;}

	public void setMarca(Marca marca) {this.marca = marca;}
	public Marca getMarca() {return marca;}

	public void setControl(Control control) {this.control = control;}
	public Control getControl() {return control;}

	public void setPrecio(int precio) {this.precio = precio;}
	public int getPrecio() {return precio;}

	public void setVolumen(int volumen) {if(this.estado && volumen >= 0 && volumen <= 7) {this.volumen = volumen;}}
	public int getVolumen() {return volumen;}

	public void setCanal(int canal) {if(this.estado == true && canal >= 1 && canal <= 120) {this.canal = canal;}}
	public int getCanal() {return canal;}

	public static void setTotalTVs(int numero) {totalTVs = numero;}
	public static int getTotalTVs() {return totalTVs;}

	public boolean getEstado() {return estado;}

	public void turnOn() {estado = true;}
	public void turnOff() {estado = false;}

	public void canalUp() {if(estado && canal < 120){canal = canal + 1;}}
	public void canalDown() {if(estado == true && canal > 1){canal = canal - 1;}}

	public void volumenUp() {if(estado == true && volumen < 7){volumen = volumen + 1;}}
	public void volumenDown() {if(estado == true && volumen > 0){volumen = volumen - 1;}}
}