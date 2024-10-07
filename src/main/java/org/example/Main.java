package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiente antioqueño tapa verde","aguardiente","FLA", LocalDate.of(2024,10,31),29.0);

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("JACOBO","71374529",40,"calle 4 sur # 80b-88","jaco@gmail.com");

        //accediendo a los atributos
        System.out.println(licorUno.getNombre());
        System.out.println(licorDos.getNombre());
    }
}