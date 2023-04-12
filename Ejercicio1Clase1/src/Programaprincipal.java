import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Programaprincipal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Partido>listaPartidos=new ArrayList<Partido>();
		
		Partido Partido;
		
		Equipo Equipo1;
		Equipo Equipo2;
		
		String archivo = "Archivo\\Resultados.txt";
		for (String linea : Files.readAllLines(Paths.get(archivo))){
		String lineas[] = linea.split(" ");
		
		Partido=new Partido();
		Equipo1=new Equipo();
		Equipo2=new Equipo();
		
		Equipo1.setNombre(lineas[0]);
		Equipo2.setNombre(lineas[3]);
		Partido.setEquipo1(Equipo1);
		Partido.setEquipo2(Equipo2);
		Partido.setGolesEquipo1(Integer.parseInt(lineas[1]));
		Partido.setGolesEquipo2(Integer.parseInt(lineas[2]));
		listaPartidos.add(Partido);
		}
		
		for (int i=0; i<listaPartidos.size(); i++)
		{
			System.out.println(listaPartidos.get(i).getEquipo1().getNombre() + "  " + listaPartidos.get(i).getGolesEquipo1() + " " + 
							listaPartidos.get(i).getGolesEquipo2() + " " + listaPartidos.get(i).getEquipo2().getNombre());
					
		}
		ArrayList<Pronostico>listaPronostico=new ArrayList<Pronostico>();
		
		Pronostico Pronostico;
		
		Equipo miEquipo1;
		Equipo miEquipo2;
		
		String archivoPronostico = "Archivo\\Pronostico.txt";
		for (String lineaPronostico : Files.readAllLines(Paths.get(archivoPronostico))){
		String lineasPronostico[] = lineaPronostico.split(" ");
		
		Pronostico=new Pronostico();
		miEquipo1=new Equipo();
		miEquipo2=new Equipo();
		
		miEquipo1.setNombre(lineasPronostico[0]);
		miEquipo2.setNombre(lineasPronostico[4]);
		Pronostico.setEquipo1(miEquipo1);
		Pronostico.setEquipo2(miEquipo2);
		Pronostico.setGanaEquipo1(Integer.parseInt(lineasPronostico[1]));
		Pronostico.setGanaEquipo2(Integer.parseInt(lineasPronostico[2]));
		Pronostico.setEmpate(Integer.parseInt(lineasPronostico[3]));
		listaPronostico.add(Pronostico);
		}
		
		for (int i=0; i<listaPronostico.size(); i++)
		{
	
			System.out.println(listaPronostico.get(i).getEquipo1().getNombre() + "  " + listaPronostico.get(i).getGanaEquipo1() + " " + 
							listaPronostico.get(i).getEmpate() + " " + 
							listaPronostico.get(i).getGanaEquipo2() + " " + listaPronostico.get(i).getEquipo2().getNombre());
					
		}
		

	

		
		}
	}
