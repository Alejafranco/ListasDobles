
package listasdobles;

public class DoubleNode <T> {
   private T data;
    private DoubleNode<T> nextNode;
    private DoubleNode<T> previousNode;
    
    public DoubleNode(T d,DoubleNode pn, DoubleNode nn){
        setData(d);
        setPreviousNode(pn);
        setNextNode(nn);
    }
    
    public DoubleNode(T d){
       this(d,null,null) ;
    }

    
    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public DoubleNode<T> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(DoubleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the previousNode
     */
    public DoubleNode<T> getPreviousNode() {
        return previousNode;
    }

    /**
     * @param previousNode the previousNode to set
     */
    public void setPreviousNode(DoubleNode<T> previousNode) {
        this.previousNode = previousNode;
    }
}
