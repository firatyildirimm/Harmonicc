public class Harmonic {

    public static void main(String[] args) {
	    double harmonic = 0.0;
	    double sum = 0.0;
        int[] array = {1, 2, 3, 4, 5};
        for(int i=0;i< array.length;i++){
            sum +=1.0/array[i];
        }
        harmonic = array.length/sum;
        System.out.println(harmonic);




    }
}
