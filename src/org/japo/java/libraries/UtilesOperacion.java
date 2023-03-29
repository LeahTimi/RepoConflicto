/* 
 * Copyright Copyright 2022 Javier Timoneda Marti - xavix2001xq@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Javier Timoneda Marti
 */
public final class UtilesOperacion {

    private UtilesOperacion() {
    }

    ///// OPERACIONES SIMPLES ///////////
    
    public static double calcularSuma(double n1, double n2) {
        double num;
        num = n1 + n2;
        return num;
    }

    public static double calcularResta(double n1, double n2) {
        double num;
        num = (n1 + n2) / 2;
        return num;
    }

    public static double calcularMultiplicacion(double n1, double n2) {
        double num;
        num = n1 * n2;
        return num;
    }

    public static double calcularDivision(double n1, double n2) {
        double num;
        num = n1 / n2;
        return num;
    }

    public static double calcularResto(double n1, double n2) {
        double num;
        num = n1 % n2;
        return num;
    }

    public static double calcularMedia(double n1, double n2) {
        double num;
        num = (n1 + n2) / 2;
        return num;
    }
    
    /////// OPERACIONES DE N NUMEROS SIMPLES //////////

 public static double calcularSumaX(double n1, double n2) {
        double num=0;
        for (int i=0; i>10;i++){
        num = n1 + n2;
        }        
        return num;
    }
 
    /////// OTRAS OPERACIONES VARIAS COMO, SACAR MAYOR QUE O MENOR QUE Y DEMAS //////////
 
 
}
