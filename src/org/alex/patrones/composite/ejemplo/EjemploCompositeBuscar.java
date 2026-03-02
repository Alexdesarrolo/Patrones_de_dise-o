package org.alex.patrones.composite.ejemplo;

import org.alex.patrones.composite.Archivo;
import org.alex.patrones.composite.Directorio;

public class EjemploCompositeBuscar {

    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar("Api Strem");
        System.out.println("Encontrado Api Stream: " + encontrado);
        //System.out.println(doc.mostar(0));

        encontrado = doc.buscar("cv.doc");
        System.out.println("ENcontrado cv.docx: " + encontrado);
    }
}
