
public class Pronostico {

	private Equipo equipo1;
	private Equipo equipo2;
	private int ganaEquipo1;
	private int empate;
	private int ganaEquipo2;
	
	public void setEquipo1(Equipo equipo1)
	{
		this.equipo1=equipo1;
	}
	
	public void setEquipo2(Equipo equipo2)
	{
		this.equipo2=equipo2;
	}
	public void setGanaEquipo1(int ganaEquipo1)
	{
		this.ganaEquipo1=ganaEquipo1;
	}
	public void setGanaEquipo2(int ganaEquipo2)
	{
		this.ganaEquipo2=ganaEquipo2;
	}
	public void setEmpate(int empate)
	{
		this.empate=empate;
	}
	public Equipo getEquipo1()
	{
		return this.equipo1;
	}
	public Equipo getEquipo2()
	{
		return this.equipo2;
	}
	public int getGanaEquipo1()
	{
		return this.ganaEquipo1;
	}
	public int getGanaEquipo2()
	{
		return this.ganaEquipo2;
	}
	public int getEmpate()
	{
		return this.empate;
	}
	}

