package Task2;

public class main {
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 7, 6, 13, 33, 9, -100, 25};
        int cont = 0, maxNumber = -200, minNumber = 200;
        while(cont < numbers.length){
            System.out.println(numbers[cont]);
            if (numbers[cont] > maxNumber){
                maxNumber = numbers[cont];
            }else{
                if(numbers[cont] < minNumber){
                    minNumber = numbers[cont];
                }
            }
            cont++;
        }
        System.out.println("El mayor numero es: "+maxNumber+"\nEl menor numero es: "+minNumber);
    }
}
