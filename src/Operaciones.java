/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CES
 */
public class Operaciones {

    /**
     * Este metodo recibe 2 parámetros de tipo int y retorna un array de tipo
     * int. El resultado esperado tras la ejecución de dicho método es un array
     * con todos los valores enteros comprendidos entre los dos parámetros
     * (ambos incluidos) en orden ascendente (de menor a mayor). Si el primer
     * parámetro es mayor que el segundo, debe generar igualmente el rango en
     * orden ascendente.
     *
     * @version 1.0
     * @since 1.0
     * @param a Es uno de los parametros de tipo entero  que recibe el metodo
     * @param b Es el otro parametro de tipo entero que recibe el metodo
     * @return nums Es el array que devuelve el metodo con todos los numeros que hay entre los dos enteros que le hemos introducido anteriormente con ambos incluidos y ordenados de menor a mayor
     */
    public int[] rango(int a, int b) {
        int[] nums = new int[Math.abs(b - a) + 1];
        int j = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                nums[j] = i;
                j++;
            }
        } else {
            for (int i = b; i <= a; i++) {
                nums[j] = i;
                j++;
            }
        }

        return nums;
    }

    /**
     * Este metodo recibe 2 parámetros de tipo int y retorna un entero. El
     * resultado esperado como retorno es la suma de todos los valores
     * comprendidos entre los dos parámetros (ambos incluidos). El método debe
     * retornar el cálculo correcto con indiferencia del orden en el que reciba
     * los dos argumentos.
     *
     * @version 1.0
     * @since 1.0
     * @param a Es uno de los parametros de tipo entero  que recibe el metodo
     * @param b Es el otro parametro de tipo entero que recibe el metodo
     * @return sum Es el parametro que retorna el metodo cuyo valor es la suma de todos los valores que hay en el rango comprendido por los valores de a y b o b y a con ambas variables incluidas
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        if (a<b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }else{
            for (int i = b; i <=a; i++) {
                sum +=i;
            }
        }

        return sum;
    }

    /**
     * Este metodo recibe un parámetro de tipo int y devuelve un boolean. El
     * resultado esperado tras la ejecución es true siempre que el valor del
     * argumento sea par. Debe retornar false en caso contrario. Si el argumento
     * es negativo o 0 se espera que el método propague la excepción
     * IllegalArgumentException.
     *
     * @version 1.0
     * @since 1.0
     * @param a Es el parametro de tipo entero que le introducimos al metodo
     * @return boolean Es el resultado que retorna el metodo, true si el parametro es par , false si el parametro es impar y un IllegalArgumentException si recibe un valor negativo o igual a 0
     */
    public boolean isPar(int a) throws IllegalArgumentException{
         if (a <=0) {
            throw new IllegalArgumentException();
        }
        if (a % 2 == 0) {
            return true;
        }
       
        return false;
    }

    /**
     * Este metodo recibe como parámetro un array de int y devuelve como
     * resultado otro array de int. El resultado esperado es un nuevo array con
     * los valores positivos del array recibido como parámetro. El nuevo array
     * generado será el retorno del método. Si el array recibido es nulo, se
     * espera que el método propague la excepción IllegalArgumentException. Si
     * el array recibido está vacío, el array resultante también lo estará.
     *
     * @version 1.0
     * @since 1.0
     * @param nums Es el array que recibe el metodo. Este puede contener numeros enteros, un valor nulo o un valor vacio
     * @return positivos Es el array que retorna el metodo , este retorna un array con los valores positivos que habiamos insertado en el array nums. Tambien  retorna un array vacio si introducimos el array nums como un array vacio, y si le damos al array nums valor nulo devuelve un IllegalArgumentsException
     */
    public int[] extraerPositivos(int[] nums) throws IllegalArgumentException{

        int n = 0;
        if (nums==null) {
                throw new IllegalArgumentException();
            }
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] > 0) {
                n++;
            }
        }

        int[] positivos = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos[j] = nums[i];
                j++;
            }
        }
        return positivos;
    }

}
