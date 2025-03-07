package ac.rgu.cm2116;

public class ArrayList<T> extends SoCETList<T> {

    private Object[] array;

    public ArrayList(){
        this.array = new Object[0];
    }

    @Override
    public boolean add(T e){
        int length = this.array.length;
        Object[] temp = new Object[length+1];
        for(int i = 0; i < length-1; i++){
            temp[i] = this.array[i];
        }
        temp[length] = e;
        this.array = temp;
        return true;
    }

    @Override
    public T remove(int index){
        int length = this.array.length;
        if(index < length){
            @SuppressWarnings("unchecked")
            T item = (T)this.array[index];
            Object[] temp = new Object[length-1];
            for(int i = 0; i < index-1;i++){
                temp[i] = array[i];
            }
            for(int i = index+1; i<length-1;i++){
                temp[i-1] = array[i];
            }
            array = temp;
            return item;
        }else{
            return null;
        }
    }

    @Override
    public boolean remove(Object e){
        return false;
    }

    @Override
    public T get(int index){
        T jim = (T)this.array[index];
        return jim;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public boolean isEmpty(){
        return true;
    }

    @Override
    public void clear(){
        
    }   
}
