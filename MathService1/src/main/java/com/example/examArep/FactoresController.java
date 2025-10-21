/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examArep;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo.quintero-r
 */

@RestController
public class FactoresController {
    
    
    @GetMapping("/primes")
    public String primes(@RequestParam("value") String value){
        int valor = Integer.parseInt(value);
        return formatJson("primos","value",primos(valor));
   
    }
    
    @GetMapping("/factors")
    public String factors(@RequestParam("value") String value){
        int valor = Integer.parseInt(value);
        return formatJson("factors","value",factores(valor));
        
    }
    
    public static String primos(int value){
        List<Integer> primos = new ArrayList<>();
        primos.add(1);
        for (int i = 1; i<=value; i++){
            if(len(listaFactores(i))==2){
                primos.add(i);
            }
        }
        return primos.toString();
    }
    
    
    public static int len(List<Integer> lista){
        int i = 0;
        for(int inter: lista){
            i = i + 1;
        } 
        return i;
    }
    
    public static List<Integer> listaFactores(int value){
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i<=value; i ++){
                int modulo = value % i;
                System.out.print(String.valueOf(modulo));
                if(modulo == 0){
                    factors.add(i);
                }
                
            }
        return factors;
    }
    public static String factores(int value){
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i<=value; i ++){
                int modulo = value % i;
                System.out.print(String.valueOf(modulo));
                if(modulo == 0){
                    factors.add(i);
                }
                
            }
        return factors.toString();
    }
    public static String formatJson(String operation, String input, String output){
        return "{\n"
                + "\"operacion\"" + ":" + "\"" + operation + "\"" + ",\n"
                + "\"input\"" + ":" + "\"" + input + "\"" + ",\n"
                +" \"output\"" + ":" + "\"" + output + "\"" + ",\n"
                + "}";
    }

}
