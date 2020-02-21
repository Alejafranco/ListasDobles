
package listasdobles;

public class StudentNode {
    private Estudiante student;
    private StudentNode nextNode;
    private StudentNode previousNode;
    
    public StudentNode(Estudiante d, StudentNode pn, StudentNode nn){
        setStudent(d);
        setNextNode(nn);
        setPreviousNode(pn);
    }
    
    public StudentNode(Estudiante d){
        this(d,null,null) ;
    }

    /**
     * @return the student
     */
    public Estudiante getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Estudiante student) {
        this.student = student;
    }

    /**
     * @return the nextNode
     */
    public StudentNode getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(StudentNode nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the previousNode
     */
    public StudentNode getPreviousNode() {
        return previousNode;
    }

    /**
     * @param previousNode the previousNode to set
     */
    public void setPreviousNode(StudentNode previousNode) {
        this.previousNode = previousNode;
    }

    
}