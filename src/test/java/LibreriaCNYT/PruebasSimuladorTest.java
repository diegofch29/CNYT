package LibreriaCNYT;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PruebasSimuladorTest {
	
	@Test
	public void programa311() {
		System.out.println("Prueba 3.1.1");
		SimuladorCaC s = new SimuladorCaC();
		MatrizComplejo m1 = new MatrizComplejo(6,6);
		m1.addComplejo(new Complejo(0,0), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(0,0), 2, 0);
		m1.addComplejo(new Complejo(0,0), 3, 0);
		m1.addComplejo(new Complejo(0,0), 4, 0);
		m1.addComplejo(new Complejo(1,0), 5, 0);
		
		m1.addComplejo(new Complejo(0,0), 0, 1);
		m1.addComplejo(new Complejo(0,0), 1, 1);
		m1.addComplejo(new Complejo(1,0), 2, 1);
		m1.addComplejo(new Complejo(0,0), 3, 1);
		m1.addComplejo(new Complejo(0,0), 4, 1);
		m1.addComplejo(new Complejo(0,0), 5, 1);
		
		
		m1.addComplejo(new Complejo(0,0), 0, 2);
		m1.addComplejo(new Complejo(0,0), 1, 2);
		m1.addComplejo(new Complejo(0,0), 2, 2);
		m1.addComplejo(new Complejo(0,0), 3, 2);
		m1.addComplejo(new Complejo(1,0), 4, 2);
		m1.addComplejo(new Complejo(0,0), 5, 2);
		
		
		m1.addComplejo(new Complejo(0,0), 0, 3);
		m1.addComplejo(new Complejo(0,0), 1, 3);
		m1.addComplejo(new Complejo(0,0), 2, 3);
		m1.addComplejo(new Complejo(1,0), 3, 3);
		m1.addComplejo(new Complejo(0,0), 4, 3);
		m1.addComplejo(new Complejo(0,0), 5, 3);
		
		m1.addComplejo(new Complejo(0,0), 0, 4);
		m1.addComplejo(new Complejo(0,0), 1, 4);
		m1.addComplejo(new Complejo(0,0), 2, 4);
		m1.addComplejo(new Complejo(0,0), 3, 4);
		m1.addComplejo(new Complejo(0,0), 4, 4);
		m1.addComplejo(new Complejo(1,0), 5, 4);
		
		m1.addComplejo(new Complejo(0,0), 0, 5);
		m1.addComplejo(new Complejo(0,0), 1, 5);
		m1.addComplejo(new Complejo(1,0), 2, 5);
		m1.addComplejo(new Complejo(0,0), 3, 5);
		m1.addComplejo(new Complejo(0,0), 4, 5);
		m1.addComplejo(new Complejo(0,0), 5, 5);
		
		System.out.println("Boolean Matrix");
		System.out.println(m1);
		
		
		MatrizComplejo m2 = new MatrizComplejo(6,1);
		m2.addComplejo(new Complejo(6,0),0,0);
		m2.addComplejo(new Complejo(2,0),1,0);
		m2.addComplejo(new Complejo(1,0),2,0);
		m2.addComplejo(new Complejo(5,0),3,0);
		m2.addComplejo(new Complejo(3,0),4,0);
		m2.addComplejo(new Complejo(10,0),5,0);
		
		System.out.println("Canicas");
		System.out.println(m2);
		
		
		System.out.println("Resultado 1 Click: ");
		MatrizComplejo mresp = new MatrizComplejo(6,1);
		mresp.addComplejo(new Complejo(0,0),0 ,0 );
		mresp.addComplejo(new Complejo(0,0),1 ,0 );
		mresp.addComplejo(new Complejo(12,0),2 ,0 );
		mresp.addComplejo(new Complejo(5,0),3 ,0 );
		mresp.addComplejo(new Complejo(1,0),4 ,0 );
		mresp.addComplejo(new Complejo(9,0),5 ,0 );
		
		System.out.println("Resultado Esperado ");
		System.out.println(mresp);
		System.out.println("Resultado Obtenido");
		System.out.println(s.program311(m1, m2, 1));
		assertEquals(mresp,s.program311(m1, m2, 1));
		
		
		
		System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp2 = new MatrizComplejo(6,1);
		mresp2.addComplejo(new Complejo(0,0),0 ,0 );
		mresp2.addComplejo(new Complejo(0,0),1 ,0 );
		mresp2.addComplejo(new Complejo(9,0),2 ,0 );
		mresp2.addComplejo(new Complejo(5,0),3 ,0 );
		mresp2.addComplejo(new Complejo(12,0),4 ,0 );
		mresp2.addComplejo(new Complejo(1,0),5 ,0 );
		
		
		System.out.println("Resultado Esperado ");
		System.out.println(mresp2);
		System.out.println("Resultado Obtenido");
		System.out.println(s.program311(m1, m2, 2));
		assertEquals(mresp2,s.program311(m1, m2, 2));
		
		
		
		
		System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp3 = new MatrizComplejo(6,1);
		mresp3.addComplejo(new Complejo(0,0),0 ,0 );
		mresp3.addComplejo(new Complejo(0,0),1 ,0 );
		mresp3.addComplejo(new Complejo(1,0),2 ,0 );
		mresp3.addComplejo(new Complejo(5,0),3 ,0 );
		mresp3.addComplejo(new Complejo(9,0),4 ,0 );
		mresp3.addComplejo(new Complejo(12,0),5 ,0 );
		
		
		System.out.println("Resultado Esperado ");
		System.out.println(mresp3);
		System.out.println("Resultado Obtenido");
		System.out.println(s.program311(m1, m2, 3));
		assertEquals(mresp3,s.program311(m1, m2, 3));
		
	}
	
	@Test
	//Fracciones
	public void programa321() {
		System.out.println("Prueba 3.2.1");
		SimuladorCaC s = new SimuladorCaC();
		MatrizComplejo m1 = new MatrizComplejo(4,4);
		
		m1.addComplejo(new Complejo(0,0), 0, 0);
		m1.addComplejo(new Complejo(0.5,0), 1, 0);
		m1.addComplejo(new Complejo(0.5,0), 2, 0);
		m1.addComplejo(new Complejo(0,0), 3, 0);
		
		m1.addComplejo(new Complejo(0.5,0), 0, 1);
		m1.addComplejo(new Complejo(0,0), 1, 1);
		m1.addComplejo(new Complejo(0,0), 2, 1);
		m1.addComplejo(new Complejo(0.5,0), 3, 1);
		
		
		m1.addComplejo(new Complejo(0.5,0), 0, 2);
		m1.addComplejo(new Complejo(0,0), 1, 2);
		m1.addComplejo(new Complejo(0,0), 2, 2);
		m1.addComplejo(new Complejo(0.5,0), 3, 2);
		
		
		m1.addComplejo(new Complejo(0,0), 0, 3);
		m1.addComplejo(new Complejo(0.5,0), 1, 3);
		m1.addComplejo(new Complejo(0.5,0), 2, 3);
		m1.addComplejo(new Complejo(0,0), 3, 3);
		
		
		System.out.println("Boolean Matrix");
		System.out.println(m1);
		
		MatrizComplejo m2 = new MatrizComplejo(4,1);
		m2.addComplejo(new Complejo(1,0),0,0);
		m2.addComplejo(new Complejo(0,0),1,0);
		m2.addComplejo(new Complejo(0,0),2,0);
		m2.addComplejo(new Complejo(0,0),3,0);
	
		System.out.println("Canicas");
		System.out.println(m2);
		
		System.out.println("Resultado 1 Click: ");
		MatrizComplejo mresp = new MatrizComplejo(4,1);
		mresp.addComplejo(new Complejo(0,0),0 ,0 );
		mresp.addComplejo(new Complejo(0.5,0),1 ,0 );
		mresp.addComplejo(new Complejo(0.5,0),2 ,0 );
		mresp.addComplejo(new Complejo(0,0),3 ,0 );
	
		
		System.out.println("Resultado Esperado ");
		System.out.println(mresp);
		System.out.println("Resultado Obtenido");
		System.out.println(s.program311(m1, m2, 1));
		assertEquals(mresp,s.program311(m1, m2, 1));
		
		
		
		System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp2 = new MatrizComplejo(4,1);
		mresp2.addComplejo(new Complejo(0.5,0),0 ,0 );
		mresp2.addComplejo(new Complejo(0,0),1 ,0 );
		mresp2.addComplejo(new Complejo(0,0),2 ,0 );
		mresp2.addComplejo(new Complejo(0.5,0),3 ,0 );
		
		
		System.out.println("Resultado Esperado ");
		System.out.println(mresp2);
		System.out.println("Resultado Obtenido");
		System.out.println(s.program311(m1, m2, 2));
		assertEquals(mresp2,s.program311(m1, m2, 2));
	
	}
	
	@Test
	public void programa322() {
		System.out.println("Prueba 3.2.2");
		int r=2;
		int b=5;
		System.out.println("Numero de rendijas: "+r);
		System.out.println("Numero de blancos: "+b);
		
		SimuladorCaC s = new SimuladorCaC();
		System.out.println("Matriz Probabilidades");
		MatrizComplejo prob = s.program321(r, b);
		System.out.println(prob);
		System.out.println("Balas");
		
		MatrizComplejo m1 = new MatrizComplejo(8,1);
		m1.addComplejo(new Complejo(1,0), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(0,0), 2, 0);
		m1.addComplejo(new Complejo(0,0), 3, 0);
		m1.addComplejo(new Complejo(0,0), 4, 0);
		m1.addComplejo(new Complejo(0,0), 5, 0);
		m1.addComplejo(new Complejo(0,0), 6, 0);
		m1.addComplejo(new Complejo(0,0), 7, 0);
		System.out.println(m1);
		assertEquals(m1,s.program321(r,b));
		
	}
	/*
	@Test
	public void programa331() {
		System.out.println("Prueba 3.3.1");
		SimuladorCaC s = new SimuladorCaC();
		MatrizComplejo m = new MatrizComplejo(4,4);
		m.addComplejo(new Complejo(0,0), 0, 0);
		m.addComplejo(new Complejo(0.5,1), 1, 0);
		m.addComplejo(new Complejo(0.5,1), 2, 0);
		m.addComplejo(new Complejo(0,0), 3, 0);
		m.addComplejo(new Complejo(0.5,1), 0, 1);
		m.addComplejo(new Complejo(0,0), 1, 1);
		m.addComplejo(new Complejo(0,0), 2, 1);
		m.addComplejo(new Complejo(-0.5,1), 3, 1);
		m.addComplejo(new Complejo(0.5,1), 0, 2);
		m.addComplejo(new Complejo(0,0), 1, 2);
		m.addComplejo(new Complejo(0,0), 2, 2);
		m.addComplejo(new Complejo(0.5,1), 3, 2);
		m.addComplejo(new Complejo(0,0), 0, 3);
		m.addComplejo(new Complejo(-0.5,1), 1, 3);
		m.addComplejo(new Complejo(0.5,1), 2, 3);
		m.addComplejo(new Complejo(0,0), 3, 3);
		
		System.out.println("Matriz Booleana");
		System.out.println(m);
		
		MatrizComplejo m1 = new MatrizComplejo(4,1);
		m1.addComplejo(new Complejo(1,1), 0, 0);
		m1.addComplejo(new Complejo(0,0), 1, 0);
		m1.addComplejo(new Complejo(0,0), 2, 0);
		m1.addComplejo(new Complejo(0,0), 3, 0);
		System.out.println("Canicas");
		System.out.println(m1);
		
		System.out.println("Respuesta A");
		System.out.println("Un click: ");
		
		MatrizComplejo m2 = new MatrizComplejo(4,1);
		m2.addComplejo(new Complejo(0,0), 0, 0);
		m2.addComplejo(new Complejo(-0.5,1.5), 1, 0);
		m2.addComplejo(new Complejo(-0.5,1.5), 2, 0);
		m2.addComplejo(new Complejo(0,0), 3, 0);

		System.out.println("Respuesta esperada: ");
		System.out.println(m2);
		System.out.println("Respuesta obtenida: ");
		System.out.println(s.program311(m, m1, 1));
		assertEquals(m2,s.program311(m, m1, 1));
	}
	*/

	@Test
	public void probabilidadPuntoX() {
		SimuladorCaC s = new SimuladorCaC();
		System.out.println("Prueba 4.1.1 ");
		MatrizComplejo m = new MatrizComplejo(4,1);
		m.addComplejo(new Complejo(-3,-1), 0, 0);
		m.addComplejo(new Complejo(0,-2), 1, 0);
		m.addComplejo(new Complejo(0,1), 2, 0);
		m.addComplejo(new Complejo(2,0), 3, 0);
		
		MatrizComplejo m1 = new MatrizComplejo(4,1);
		m1.addComplejo(new Complejo(0.5263157894736842,0), 0, 0);
		m1.addComplejo(new Complejo(0.21052631578947364,0), 1, 0);
		m1.addComplejo(new Complejo(0.05263157894736841,0), 2, 0);
		m1.addComplejo(new Complejo(0.21052631578947364,0), 3, 0);
		
		System.out.println("Ket");
		System.out.println(m);
		int p = 2;
		System.out.println("Posicion en la que se desea calcular la probabilidad: "+p);
		System.out.println("Resultado esperada: "+ m1.getMatrizCompl()[p][0].getReal());
		System.out.println("Resultado obtenido: "+s.calcularProbParticulaxPos(p, m));
		assertEquals(m1.getMatrizCompl()[p][0].getReal(),s.calcularProbParticulaxPos(p, m),1);
		
	}
	
	@Test 
	public void probabilidadTransitarKetAKet() {
		SimuladorCaC s = new SimuladorCaC();
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addComplejo(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addComplejo(new Complejo(0,Math.sqrt(2)/2),1 ,0);
		
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(0,Math.sqrt(2)/2),0 ,0);
		m1.addComplejo(new Complejo(-Math.sqrt(2)/2,0),1 ,0);
		
		System.out.println("Ket 1");
		System.out.println(m);
		System.out.println("Ket 2");
		System.out.println(m1);
		System.out.println("Resultado esperado");
		Complejo resp = new Complejo(0,-1);
		System.out.println(resp);
		System.out.println("Respuesta Obtenida");
		System.out.println(s.probabilidadKetAKet(m, m1));
		resp.equals(s.probabilidadKetAKet(m, m1));
	}
	
	@Test
	public void calculandoValorMedio() {
		SimuladorCaC s = new SimuladorCaC();
		System.out.println(" Prueba calcular el valor medio: ");
		
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addComplejo(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addComplejo(new Complejo(0,Math.sqrt(2)/2),1 ,0);
		System.out.println(" Vector:  ");
		System.out.println(m);
		
		MatrizComplejo m1 = new MatrizComplejo(2,2);
		m1.addComplejo(new Complejo(1,0),0 ,0);
		m1.addComplejo(new Complejo(0,1),1 ,0);
		m1.addComplejo(new Complejo(0,-1),0 ,1);
		m1.addComplejo(new Complejo(2,0),1 ,1);
		
		Complejo resp = new Complejo(2.5000000000000004,0);
		System.out.println("Observable");
		System.out.println(m1);
		
		System.out.println("Resultado esperado: ");
		System.out.println(resp);
		System.out.println("Resultado obtenido: ");
		System.out.println(s.calculaValorMedio(m1, m));
		assertEquals(resp,s.calculaValorMedio(m1, m));
	}
	
	@Test
	public void calculandoVarianza() {
		SimuladorCaC s = new SimuladorCaC();
		System.out.println(" Prueba calcular la varianza: ");
		
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addComplejo(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addComplejo(new Complejo(0,Math.sqrt(2)/2),1 ,0);
		System.out.println(" Vector:  ");
		System.out.println(m);
		
		MatrizComplejo m1 = new MatrizComplejo(2,2);
		m1.addComplejo(new Complejo(1,0),0 ,0);
		m1.addComplejo(new Complejo(0,1),1 ,0);
		m1.addComplejo(new Complejo(0,-1),0 ,1);
		m1.addComplejo(new Complejo(2,0),1 ,1);
		
		System.out.println("Observable");
		System.out.println(m1);
		Complejo resp = new Complejo(0.25,0);
		
		
		System.out.println("Resultado esperado: ");
		System.out.println(resp);
		System.out.println("Resultado obtenido: ");
		System.out.println(s.calculaVarianza(m1, m));
		assertEquals(resp,s.calculaVarianza(m1, m));
	
		
	}	
	
	@Test
	public void calculaDinamicaSistema() {
		SimuladorCaC s = new SimuladorCaC();
		LibreriaMatrizComplejo m = new LibreriaMatrizComplejo();
		System.out.println(" Prueba calcular dinamica del sistema: ");
		
		
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addComplejo(new Complejo(1,0),0,0);
		m1.addComplejo(new Complejo(0,0),1,0);
		System.out.println("Vector ket: ");
		System.out.println(m1);
		
		
		MatrizComplejo m2 = new MatrizComplejo(2,2);
		m2.addComplejo(new Complejo(0,0),0,0);
		m2.addComplejo(new Complejo(1,0),1,0);
		m2.addComplejo(new Complejo(1,0),0,1);
		m2.addComplejo(new Complejo(0,0),1,1);
		
		MatrizComplejo m3 = new MatrizComplejo(2,2);
		m3.addComplejo(new Complejo(0,0),0,0);
		m3.addComplejo(new Complejo(1,0),1,0);
		m3.addComplejo(new Complejo(1,0),0,1);
		m3.addComplejo(new Complejo(0,0),1,1);
		
		ArrayList<MatrizComplejo>  resp = new ArrayList<MatrizComplejo>();
		resp.add(m2);
		resp.add(m3);
		
		System.out.println("Respuestas");
		System.out.println(resp);
		

		MatrizComplejo m4 = m.multiplicacionMatrices(m2, m1);
		MatrizComplejo m5 = m.multiplicacionMatrices(m3, m4);
		System.out.println("Resultado esperado: ");
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(s.dinamicaSistema(2, m1, resp));
		assertEquals(m5,s.dinamicaSistema(2, m1, resp));
		
		
		
		
	}
	

}
