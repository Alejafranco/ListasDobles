
package listasdobles;

public class OperacionesListaDoble<T extends Comparable> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public OperacionesListaDoble() {
        head = tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void add(T d) {

        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            head = new DoubleNode<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }
    }
    
     public String showData() {
        String data = "";
        DoubleNode<T> current = this.head;
        while (current != null) {
            data += current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }
     
     public boolean searchData(T d) {
        DoubleNode<T> current = this.head;
        while (current != null) {
            if (current.getData() == d) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }
     
    public void addLast(T d) {
        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            tail = new DoubleNode<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
    }
    
    public void addOrdered(T d) throws Exception{
        if(isEmpty() || d.compareTo(head.getData()) == -1) {
            add(d);
            return;
        }
        if(searchData(d)){
            throw new Exception("EL DATO QUE DESEA INGRESAR YA EXISTE!");
        }
        if (d.compareTo(tail.getData()) == 1) {
            addLast(d);
            return;
        }
        
        DoubleNode<T> current = head.getNextNode();
        DoubleNode<T> newNode;
        
        while (current.getData().compareTo(d)==-1) {            
            current=current.getNextNode();
        }
        
        newNode = new DoubleNode<>(d,current.getPreviousNode(),current);
        current.getPreviousNode().setNextNode(newNode);
        current.setPreviousNode(newNode);
    }
    
    public void delete(T d) throws Exception {
        if(isEmpty()){
            throw new Exception("NO EXISTEN DATOS POR BORRAR");
        }else if(!searchData(d)){
            throw new Exception("EL DATO QUE DESEA BORRAR NO EXISTE!");
        }else if (head.getData() == d) {
            this.head = head.getNextNode();
            this.tail = null;
        }else{
            DoubleNode<T> current = this.head;
           while (current != null) {
                if (current.getData() == d) {
                    if(current.getNextNode() == null){
                        current.setNextNode(null);
                        current.getPreviousNode().setNextNode(null);
                    }else{
                        current.getPreviousNode().setNextNode(current.getNextNode());
                        current.getNextNode().setPreviousNode(current.getPreviousNode());
                        current.setNextNode(null);
                        current.setPreviousNode(null);
                    }                
                }
                current = current.getNextNode();
            }
        }
    }
    
    public void insetarNuevoNodo(T afterOf, T nuevoDato) throws Exception {
        if (isEmpty()) {
            throw new Exception("LA LISTA ESTÁ VACÍA");
        } else if (!searchData(afterOf)) {
            throw new Exception("EL DATO NO EXISTE");
        } else if (searchData(nuevoDato)) {
            throw new Exception("EL NUEVO DATO QUE DESEA INGRESAR YA EXISTE");
        } else {
            DoubleNode<T> current = this.head;
            while(current != null){
                if(current.getData() == afterOf){
                    if(current.getNextNode() == null){
                        DoubleNode<T> newNode = new DoubleNode<>(nuevoDato,current,null);
                        current.setNextNode(newNode);
                    }else{
                        DoubleNode<T> newNode = new DoubleNode<>(nuevoDato,current,current.getNextNode());
                        current.getNextNode().setPreviousNode(newNode);
                        current.setNextNode(newNode);                      
                    }   
                }
                current = current.getNextNode();
            }
        }
    }
}

