package ac.rgu.cm2116;

public class ArrayList<T> extends SoCETList<T> {

    private Object[] array;
    private int size;

    public ArrayList(){
        this.size = 0;
        this.array = new Object[256];
    }

    @Override
    public boolean add(T e){
        int length = this.array.length;
        
        //Old method
        if(size+1 > length){
            Object[] temp = new Object[length+1];
            for(int i = 0; i <= length-1; i++){
                temp[i] = this.array[i];
            }
            temp[length] = e;
            this.array = temp;
        }
        
        //
        //Easier method
        //Works when you have an empty arraylist tho is inefficent
        // for(int i = 0; i < length; i++){
        //     if(this.array[i] == null){
        //         this.array[i] = e;
        //         break;
        //     }
        // }
        this.array[this.size] = e;
        this.size += 1;
        return true;
    }

    @Override
    public T remove(int index){
        //int length = this.array.length;
        // if(index < length){
        //     @SuppressWarnings("unchecked")
        //     T item = (T)this.array[index];
        //     Object[] temp = new Object[length-1];
        //     for(int i = 0; i < index-1;i++){
        //         temp[i] = array[i];
        //     }
        //     for(int i = index+1; i<length-1;i++){
        //         temp[i-1] = array[i];
        //     }
        //     array = temp;
        //     this.size -= 1;
        //     return item;
        // }else{
        //     return null;
        // }
        if(index < size){
            @SuppressWarnings("unchecked")
            T item = (T)this.array[index];
            this.array[index] = null;
            for(int i = index+1; i < size-1; i++){
                array[i-1] = array[i];
            }
            this.size -= 1;
            return item;
        }else{
            return null;
        }
    }

    @Override
    public boolean remove(Object e){
        int counter = 0;
        boolean found = false;
        int length = this.array.length;
        for(int i = 0; i <= length-1;i++){
            if(this.array[i] == e){
                found = true;
                break;
            }else{
                counter++;
            }
        }
        if(found){
            remove(counter);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public T get(int index){
        if(index > this.array.length || index < 0){
            return null;
        }else{
            @SuppressWarnings("unchecked")
            T jim = (T)this.array[index];
            return jim;
        }
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        if(this.array[0] != null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void clear(){
        int tempSize = size;
        for(int i = 0; i <= tempSize -1; i++){
            remove(0);
        }
    }   
}
