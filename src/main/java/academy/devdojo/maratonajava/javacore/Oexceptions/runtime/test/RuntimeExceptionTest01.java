package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        //Error != Exceção, Error é do tipo Throwable
        //Checked = Exceções que são filhas da classe EXCEPTION diretamente (nem vai compilar)
        //Unchecked = Exceções que são filhas de RunTimeException (quase 100% das vezes, o problema é você)
        //RunTimeException é uma exceção do tipo UNCHECKED
        Object object = null;
        int [] nums = {1,2};
        System.out.println(nums[2]);

    }
}
