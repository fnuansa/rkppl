package com.ujian;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoalTest {
	
	private static Soal soal;
	
	@Before
	public void awalTest(){
		soal = new Soal();
		System.out.println("Mengawali Testing");
	}
	
	@Test
	public void test1(){
		assertNotSame("seharusnya 2", 4, soal.perkalian(1, 2));
	}
	
	@Test
	public void test2(){
		assertSame("seharusnya 2", 2, soal.perkalian(1, 2));
	}
	
	@Test
	public void test3(){
		assertNotSame("seharusnya 24", 24, soal.faktorial(4));
	}
	
	@Test
	public void test4(){
		assertSame("seharusnya 24", 24, soal.faktorial(4));
	}
	
	@Test
	public void test5(){
		assertNotSame("seharusnya 8", 9, soal.pangkat(2, 3));
	}
	
	@Test
	public void test6(){
		assertSame("seharusnya 8", 8, soal.pangkat(2, 3));
	}
	
	@After
	public void akhirTest(){
		System.out.println("Akhir testing");
	}

}
