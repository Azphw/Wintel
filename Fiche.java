package datas;
import java.io.*;
import java.util.*;

public class Fiche implements Serializable{
  
	private String nom;
	private String prenom;
	private String telephone;
	
	public Fiche(String leNom , String lePrenom , String leTel) throws IllegalArgumentException{
		
		if((lePrenom==null)||(leNom==null)||(leTel==null)){
			throw new IllegalArgumentException("Erreur, un attribut est null");
		}
		
		if((lePrenom.length()==0)||(leNom.length()==0)||(leTel.length()==0)){
			throw new IllegalArgumentException("Erreur, un attribut est vide");
		}
		
		nom = leNom;
		prenom = lePrenom;
		telephone = leTel;
		mail = unMail;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public String getTel(){
		return telephone;
	}
	
	public String toString(){
		return "Nom : "+getNom()+"\n Prenom : "+getPrenom()+"\n Telephone : "+getTel();
	}
}
		
		
