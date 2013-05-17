package datas;

import java.io.*;
import java.util.*;

public class Annuaire implements Serializable{

        private Hashtable <String, Fiche> tabFiches;

        public Annuaire(){

                tabFiches = new Hashtable <String, Fiche> ();
        }

        public Fiche consulter(String cle) throws IllegalArgumentException{

                if(cle == null) throw new IllegalArgumentException("ClÃ©
pas valide");
                return tabFiches.get(cle);
        }

        public int taille(){
                return tabFiches.size();
        }

        public boolean existe(String cle){

                boolean retour = false;
                retour = tabFiches.containsKey(cle);
                return retour;
        }

        public Enumeration<String> cles(){
                return tabFiches.keys();
        }

        public static Annuaire charger(){

                Annuaire annu = null;

                try{
                        FileInputStream in = new
FileInputStream("annuaire.out");
                        ObjectInputStream flux = new ObjectInputStream(in);

                        annu = (Annuaire)flux.readObject();
                }

                catch(IOException e) {System.out.println(e.getMessage());}
                catch(ClassNotFoundException c)
{System.out.println(c.getMessage());}

                return annu;
        }

        public void sauver(){

                try{
                        FileOutputStream out = new
FileOutputStream("annuaire.out");
                        ObjectOutputStream flux = new
ObjectOutputStream(out);

                        flux.writeObject(this);
                }

                catch(IOException e) {System.out.println(e.getMessage());}
        }

        public void ajouter(String cle, Fiche personne) throws
IllegalArgumentException,
Exception{

                if(cle == null || personne == null) throw new
IllegalArgumentException("Erreur de
clÃ© ou personne");
                if(tabFiches.containsKey(cle)) throw new Exception("cle
existante");
                tabFiches.put(cle, personne);
        }

        public void supprimer(String cle) throws IllegalArgumentException,
NoSuchElementException{

                if(cle == null) throw new IllegalArgumentException("Erreur
de cle");
                if(!tabFiches.containsKey(cle)) throw new
NoSuchElementException("cle inexistante");
                tabFiches.remove(cle);
        }

        public void modifier(String cle, Fiche personne) throws
IllegalArgumentException,
NoSuchElementException{

                if(cle == null) throw new IllegalArgumentException("Erreur
de cle");
                if(!tabFiches.containsKey(cle)) throw new
NoSuchElementException("cle inexistante");

                tabFiches.remove(cle);
                tabFiches.put(cle, personne);
        }
}


