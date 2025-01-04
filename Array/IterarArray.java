/*
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

int ar[n]: an array of integers .
Return

long: the sum of all array elements
Input Format

The first line of the input consists of an integer n.
The next line contains n space-separated integers contained in the array.

Output Format

Return the integer sum of the elements in the array.
Constraints:
1 ≤ n ≤ 10
0 ≤ ar[i] ≤ 10¹⁰
*/

/*
Resolução:
1 - Iterar sobre a lista "ar": Somar cada elemento da lista acumulando o valor em uma váriavel;
2 - Usar acumulador: criar uma váriavel do tipo long para armazenar a soma total. O tipo long é necessario porque os valores da lista podem ser grandes;
3 - Retornar a soma: após iterar por todos os elementos, retornar o valor do acumulador.

long sum = 0; estamos inicializando a váriavel "sum" com zero para começar a acumular valores;
for (Long sum : ar) [iterar] pecorremos cada número na lista "ar" com um loop enhanced for;
sum +=  num; para cada número, adicionamos ao sum;
retun sum; No final, retornamos o resultado acumulado;

Como funciona o for (Long num: ar) é uma forma de iterar sobre cada elemento da lista "ar". No caso, Long num representa cada elemento da lista conforme o loop avança.

"ar" = lista de numeros 
"num" = em cada iteração, o num será igual a um dos números armazenados na lista "ar".
"for" = o loop garante que você pecorra toda a lista, pegando um elemento por vez.

Porque utiliamos o num?

Quando dizemos "sum+= num;" estamos dizendo para somar o valor atual do elemento (num) ao acumulador (sum).
Cada elemento em "ar" é do tipo "Long", então o loop pega um elemento de cada vez e armazena em "num".
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        
        for ( long num : ar) {
            sum += num;
        }
        return sum;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
