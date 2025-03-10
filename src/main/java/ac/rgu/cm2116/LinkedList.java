package ac.rgu.cm2116;

public class LinkedList<T> extends SoCETList<T> {

    private ListNode<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean add(T e){
        if(head == null){
            head = new ListNode<T>(e);
        }else{
            ListNode<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode<T>(e);
        }
        size++;
        return true;
    }

    @Override
    public T remove(int index){
        T value = null;
        if(index < size){
            if(index == 0){
                value = head.value;
                head = head.next;
            }
            else{
                ListNode<T> temp = head;
                int counter = 0;
                while(counter < index - 1){
                    temp = temp.next;
                    counter++;
                }
                value = temp.next.value;
                temp.next = temp.next.next;
            }
            size--;
        }
        return value;
    }

    @Override
    public boolean remove(Object e){
        return false;
    }

    @Override
    public T get(int index){
        return null;
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

    /** Don't edit below this line - here be dragons :) */

    /**
     * Inner class to represent a List Node
     * S is used as the type parameter to avoid conflict with T in the outer class
     */
    class ListNode<S>{

        private S value;
        private ListNode<S> next;

        public ListNode(S value){
            this.value = value;
            this.next = null;
        }

        public ListNode<S> getNext(){
            return this.next;
        }

        public void setNext(ListNode<S> next){
            this.next = next;
        }

        public S getValue(){
            return this.value;
        }
    }
    
}
