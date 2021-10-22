package principal;


import java.util.LinkedList;

public class SparceMatrix<T extends Number> {

    public SparceMatrix(int n, int m, T num) {
        this.width = n;
        this.height = m;
        this.tam = num;
    }

    public SparceMatrix(int n, int m){
        this(n,m,null);
    }
    
  

    public T getTam() {
        return tam;
    }

    public void setNum(T num) {
        this.tam = num;
    }

    public LinkedList<LinkedList<T>> getMatrix() {
        return matrix;
    }

    public void setMatrix(LinkedList<LinkedList<T>> matrix) {
        this.matrix = matrix;
    }

      
    
    int width;
    int height;
    T tam;
    LinkedList<LinkedList<T>> matrix;
}