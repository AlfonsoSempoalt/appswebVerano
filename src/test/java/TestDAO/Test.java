package TestDAO;

import dominio.Estado;
import dominio.Municipio;
import java.util.ArrayList;
import java.util.List;
import repository.EstadoRepository;

public class Test {

    public static void main(String[] args) {
        
          EstadoRepository estadoDAO = new EstadoRepository();
          
          List<Municipio> listaMunicipios = new ArrayList<>(); 
          
          Estado estado = new Estado();
          estado.setNombre("Sonora");
          Municipio municipio = new Municipio("Obregon", estado);
          listaMunicipios.add(municipio);
          estado.setMunicipios(listaMunicipios);
          
          estadoDAO.guardar(estado);
//        AdmorRepository admorDAO = new AdmorRepository();
//        
//        List<Anclado> listaAnclados = new ArrayList<>();
//        String nombreCompleto = "Pochito Arce";
//        String email = "pochito@gmail.com";
//        String contrasenia = "1234";
//        String telefono = "6441092567";
//        byte[] avatar = String.format("hola").getBytes();
//        Municipio ciudad = new Municipio("Obregon", new Estado("Sonora", null));
//        Date fechaNacimiento = new Date();
//        Genero genero = Genero.HOMBRE;
//        List<Comun> listaComunes = new ArrayList<>();
//        
//        Admor admin = new Admor(listaAnclados, nombreCompleto, email, contrasenia, telefono, avatar, ciudad, fechaNacimiento, genero, listaComunes);
//        
//        admorDAO.guardar(admin);
        
        
    }
    
}
