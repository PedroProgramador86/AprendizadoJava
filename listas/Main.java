package listas;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main (String[]args) {

        List<String> nome = new ArrayList<>();

        nome.add("Pedro");
        nome.add("Sofia");
        nome.add("Conceição");
        nome.add("Fabio");
        nome.add("Helena");
        nome.add("Angelina");
        nome.add("Xana");

        //Acessando elemento pelo indice:
        System.out.println("Indice 3 da lista: "+ nome.get(3));

        //Printar o tanho ("size" == "tamanho"):
        System.out.println("Tamanho (Size): "+ nome.size());

        //Removendo elemento:
        nome.remove("Xana");

        System.out.println("Tamanho (Size): "+ nome.size());

        // Percorrendo a lista:
        for(String elemento:nome){

            System.out.println(elemento);

        }

        //Verificando se contém determinado elemento:
        System.out.println("O nome 'Xana' existe na lista ? "+ nome.contains("Xana"));


    }

}