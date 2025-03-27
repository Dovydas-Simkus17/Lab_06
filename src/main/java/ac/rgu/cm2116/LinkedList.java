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
        int counter = 0;
        boolean found = false;
        int length = this.size;
        ListNode<T> temp = head;

        if(head == e){
            found = true;
        }
        for(int i = 0; i <= length-1;i++){
            if(temp == e || found == true){
                found = true;
                break;
            }else{
                counter++;
                temp = temp.next;
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
        if(index < size){
            if(index == 0){
                return head.value;
            }
            else{
                ListNode<T> temp = head;
                int counter = 0;
                while(counter < index){
                    temp = temp.next;
                    counter++;
                }
                return temp.value;
            }
        }
        return null;

    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void clear(){
        while(head != null){
            if(head.next != null){
                head = head.next;
            }else{
                head = null;
            }
        }
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
