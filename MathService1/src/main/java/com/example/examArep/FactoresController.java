/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examArep;

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
        return "primes";
    }
    
    @GetMapping("/factors")
    public String factors(@RequestParam("value") String value){
        int valor = Integer.parseInt(value);
        return "factors";
    }
    
    public static String primo(int value){
        return "";
    }
    
    public static String factores(int value){
        return "";
    }
    public static String formatJson(String operation, String input, String output){
        return "{\n"
                + "\"operacion\"" + ":" + "\"" + operation + "\"" + ",\n"
                + "\"input\"" + ":" + "\"" + input + "\"" + ",\n"
                +" \"output\"" + ":" + "\"" + output + "\"" + ",\n"
                + "}";
    }

}
