package listas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.*;

public class Listas {
	private static List<Categoria> listCategorias = new ArrayList<Categoria>();
	private static List<Editoriales> listEdit = new ArrayList<Editoriales>();
	private static List<Libros> listLibros = new ArrayList<Libros>();
	private static Categoria categ = new Categoria();
	private Editoriales edit = new Editoriales();
	private Date fecha = new Date();

	//private Libros libro = new Libros(1, "Jicaras Tristes", 1930, 6.50, fecha, categ.getCategoria(),
			//edit.getEditorial());
	
	public void listaLibros(String cat) {
		for(Categoria c: listCategorias) {
			c.setIdCat(listCategorias.size()+1);
			c.setCategoria(cat);
		}
	}

	public void llenarLibros() {
		Libros libro1 = new Libros();
		libro1.setIdLibro(1);
		libro1.setNombre("El viaje al centro de la Tierra");
		libro1.setYear(1880);
		libro1.setPrecio(20.00);
		Date fecha1 = new Date();
		fecha1.setYear(1880);
		fecha1.setMonth(5);
		fecha1.setDate(20);
		libro1.setFechaL(fecha1);
		libro1.setCategoria("Aventuras");
		libro1.setEditorial("La Ceiba");
		
		Libros libro2 = new Libros();
		libro2.setIdLibro(2);
		libro2.setNombre("Narraciones extraordinarias");
		libro2.setYear(1890);
		libro2.setPrecio(12.00);
		Date fecha2 = new Date();
		fecha2.setYear(1892);
		fecha2.setMonth(9);
		fecha2.setDate(3);
		libro2.setFechaL(fecha2);
		libro2.setCategoria("Terror");
		libro2.setEditorial("Roxville");
		
		Libros libro3 = new Libros();
		libro3.setIdLibro(3);
		libro3.setNombre("Cuentos de Barro");
		libro3.setYear(1970);
		libro3.setPrecio(9.50);
		Date fecha3 = new Date();
		fecha3.setYear(1971);
		fecha3.setMonth(2);
		fecha3.setDate(16);
		libro3.setFechaL(fecha3);
		libro3.setCategoria("Infantiles");
		libro3.setEditorial("Santillana");
		
		listLibros.add(libro1);
		listLibros.add(libro2);
		listLibros.add(libro3);
	}

	public List<Libros> obtenerLibros() {

		return listLibros;
	}
	
	
	public List<Libros> agregarLibros(String nombre, Integer anio, Integer anioPub, Integer mesPub, Integer diaPub, Integer cat, Integer edit) {
		Libros l = new Libros();
		l.setNombre(nombre);
		l.setYear(anio);
		Date publi = new Date();
		publi.setYear(anio);
		publi.setMonth(mesPub);
		publi.setDate(diaPub);
		l.setFechaL(publi);
		Categoria c = new Categoria();
		c=listCategorias.get(cat);
		l.setCategoria(c.getCategoria());
		Editoriales e = new Editoriales();
		e=listEdit.get(edit);
		l.setEditorial(e.getEditorial());
		return listLibros;
	}

	public static List<Categoria> getListCategorias() {
		return listCategorias;
	}

	public static void setListCategorias(List<Categoria> listCategorias) {
		Listas.listCategorias = listCategorias;
	}

	public static List<Editoriales> getListEdit() {
		return listEdit;
	}

	public static void setListEdit(List<Editoriales> listEdit) {
		Listas.listEdit = listEdit;
	}

	public static List<Libros> getListLibros() {
		return listLibros;
	}

	public static void setListLibros(List<Libros> listLibros) {
		Listas.listLibros = listLibros;
	}


}