public class Main {
    public static void main(String[] args){
        /*Crear el objeto cedula con la clase Cedula*/
        Cedula cedula = new Cedula();
        /*Imprimir en consola un numero de cedula con la letra correspondiente
        * El numero se pasa como parametro al metodo CedulaConLetras.
        * NOTA: El parametro numero es de tipo Long por tanto se le agrega la letra l al final. NO significa que es la letra de la cedula
        * Siempre se debe agregar a cualquier numero de cedula.
        * */
        System.out.println(cedula.CedulaConLetra(4861806890001l));
        /*
        * Imprimir la cedula con guiones.
        * */
        System.out.println(cedula.CedulaConGuiones(4861806890001l));
    }
}
