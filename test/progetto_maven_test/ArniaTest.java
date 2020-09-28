package progetto_maven_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArniaTest {
	
	Arnia a1;

	
	@Before
	public void inizializzazione() {
		System.out.println("Arnia inizializzata");
		//a1 = new Arnia("aa",true,true,5); //caso corretto 1
		
		//a1 = new Arnia("aa",true,false,0); //caso corretto 2
		
		a1 = new Arnia("aa",true,true,0); //caso errato
		//a1 = new Arnia("aa",true,true,-1); //caso ???
		//a1 = new Arnia("aa",false,true,5); //caso disastroso
	}
	
	
	@Test
	public void testRaccolta() {
		System.out.println("Bisogna raccogliere prima di trattare");
		
		if(a1.getStatusRaccolta() && a1.getStatusTrattamento())
		{	
			assertTrue("Trattamento e raccolta fatti",true);
		}
		else if (!a1.getStatusRaccolta() && a1.getStatusTrattamento())
		{
			assertTrue("Raccolto rovinato", false);
		}
		else if (a1.getStatusRaccolta() && !a1.getStatusTrattamento())
		{
			assertTrue("Manca trattamento", true);
		}
		else
		{
			assertTrue("Bisogna ancora fare tutto", true);
		}
		
		//fail("errore if"); 
	}
	
	@Test
	public void testCoerenza() {
		System.out.println("Bisogna sempre fare almeno un trattamento");
		
		if(a1.getStatusTrattamento() && (a1.getNumeroTrattamenti() < 1))
		{
			assertTrue("Fine trattamento senza trattamenti", false);
		}
		else if (a1.getNumeroTrattamenti() < 0)
		{
			assertTrue("Trattamenti negativi???", false);
		}	
		else	
		{
			assertTrue("Ok", true);
		}

		//fail("errore if"); 
	}
	
}
