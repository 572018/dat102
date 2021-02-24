package no.hvl.dat102;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class TestOrdliste {
	
	
	String[] ord = { "God", "dag", "Hans", "Hansen", "Hansaby"};
	String[] ord2 = { "God", "dag", "Hans", "Hansen", "Hansaby"};
	
	@Test
	public void testUnion() {
		MengdeADT<String> ordliste1 = new KjedetMengde<String>();
		MengdeADT<String> tom = new KjedetMengde<String>();
		MengdeADT<String> ordliste2 = new KjedetMengde<String>();
		
		for (int i = 0; i < ord.length; i++) {
			ordliste1.leggTil(ord[i]);
		}
		for (int i = 0; i < ord.length; i++) {
			ordliste2.leggTil(ord2[i]);
		}
		
		//Skal være lik ord2 som er tabell
		//begge er kjedetmengde, union
		assertEquals(ordliste1, ordliste1.union(tom), "Test and union");
	}
	
	@Test
	public void testSnitt() {
		MengdeADT<String> ordliste1 = new KjedetMengde<String>();
		MengdeADT<String> tom = new KjedetMengde<String>();
		MengdeADT<String> ordliste2 = new KjedetMengde<String>();
		
		for (int i = 0; i < ord.length; i++) {
			ordliste1.leggTil(ord[i]);
		}
		for (int i = 0; i < ord.length; i++) {
			ordliste2.leggTil(ord2[i]);
		}
		
		//Skal være lik ord2 som er tabell
		//begge er kjedetmengde, union
		assertEquals(ordliste2, ordliste1.snitt(tom), "Test and union");
	}
	
	public void testDifferens() {
		MengdeADT<String> ordliste1 = new KjedetMengde<String>();
		MengdeADT<String> tom = new KjedetMengde<String>();
		MengdeADT<String> ordliste2 = new KjedetMengde<String>();
		
		for (int i = 0; i < ord.length; i++) {
			ordliste1.leggTil(ord[i]);
		}
		for (int i = 0; i < ord.length; i++) {
			ordliste2.leggTil(ord2[i]);
		}
		
		//Skal være lik ord2 som er tabell
		//begge er kjedetmengde, union
		assertEquals(ordliste2, ordliste1.differens(tom), "Test and union");
	}
	
}
