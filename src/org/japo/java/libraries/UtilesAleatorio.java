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

import java.util.Random;

/**
 *
 * @author Javier Timoneda Marti
 */
public class UtilesAleatorio {
    
    private UtilesAleatorio(){
    }

    public static final Random RND = new Random();

    public static final int generarEnteroAleatorio(int min, int max) {

        final int VALOR_MAX = max;
        final int VALOR_MIN = min;
        int num_ran = RND.nextInt(VALOR_MAX - VALOR_MIN + 1) + VALOR_MIN;

        return num_ran;
    }

    public static final double generarRealAleatorio(int min, int max) {

        final int VALOR_MAX = max;
        final int VALOR_MIN = min;
        double num_ran = RND.nextDouble() * (VALOR_MAX - VALOR_MIN) + VALOR_MIN;

        return num_ran;
    }

    public static final boolean generarLogicoAleatorio(int min, int max) {

        boolean boo_ran = RND.nextBoolean();

        return boo_ran;
    }
    
        public static final double generarCharAleatorio(int min, int max) { 

        final int VALOR_MAX = max;
        final int VALOR_MIN = min;
        char char_ran = (char)(RND.nextInt(VALOR_MAX - VALOR_MIN + 1) + VALOR_MIN);

        return char_ran;
    }
}
