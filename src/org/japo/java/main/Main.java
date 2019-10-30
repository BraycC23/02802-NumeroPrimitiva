/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
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
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {
public static final Random RND = new Random();
    public static void main(String[] args) {
        //Constantes
        final int Prim_Max = 49;
        final int Prim_Min = 1;
        //Variable
        int Num_prim;
        // Generar datos 
        Num_prim = RND.nextInt(Prim_Max - Prim_Min + 1) + Prim_Min;
        //Mensaje
        System.out.printf("Número Primitiva ....: %d%n", Num_prim);
        
    }
}
