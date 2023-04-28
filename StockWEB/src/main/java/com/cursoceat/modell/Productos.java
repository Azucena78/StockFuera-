package com.cursoceat.modell;

public class Productos {


	private static int idGeneral;
	private int idProducto;
	private int cantidadP;
	private String nombreP;
	private String descripcionP;
	
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productos (int cantidadP, String nombreP, String descripcionP) {
		
		this.idProducto = ++idGeneral;
		this.cantidadP = cantidadP;
		this.nombreP = nombreP;
		this.descripcionP = descripcionP;
	}
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidadP() {
		return cantidadP;
	}

	public void setCantidadP(int cantidadP) {
		this.cantidadP = cantidadP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}
	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", cantidadP=" + cantidadP + ", nombreP=" + nombreP
				+ ", descripcionP=" + descripcionP + "]";
	}

}
