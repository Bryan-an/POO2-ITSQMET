package com.itsqm.modelo;

import java.util.Set;
import java.util.stream.Stream;
import org.json.JSONObject;

/**
 *
 * @author Bryan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgendaModelo am = new AgendaModelo();
        JSONObject datos = am.consultarClientes("");
        Set<String> keys = datos.keySet();

        keys.stream()
                .map(key -> (String[]) datos.get(key))
                .forEach(arregloDatos -> Stream.of(arregloDatos).forEach(System.out::println));

//        for (int i = 0; i < datos.length(); i++) {
//            System.out.println("-->" + datos.getJSONArray(i + ""));
//
//            String[] arregloDatos = (String[]) datos.getJSONArray(i + "").get(0);
//
//            for (String dato : arregloDatos) {
//                System.out.println(dato);
//            }
//        }
//        for (int i = 0; i < datos.length(); i++) {
//            System.out.println(datos.length());
//            System.out.println("-->" + datos.get(i + ""));
//
//            String[] arregloDatos = (String[]) datos.get(i + "");
//
//            for (String dato : arregloDatos) {
//                System.out.println(dato);
//            }
//        }
    }

}
