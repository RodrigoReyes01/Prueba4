public class letra implements Comparable<letra>{
    char letras;
    int counter = 0;

    public letra(char a){
        this.letras = a;
    }

    public int compareTo(letra other){
        if(counter > other.counter){
            return -1;
        }
        else if (counter == other.counter){
            return 0;
        }
        else {
            return 1;
        }
    }
}
