
public class Node {

	private int record;  
    //ָ����һ������  
    private Node nextNode;  
  
    public Node(int record) {  
        super();  
        this.record = record;  
    }  
    public int getRecord() {  
        return record;  
    }  
    public void setRecord(int record) {  
        this.record = record;  
    }  
    public Node getNextNode() {  
        return nextNode;  
    }  
    public void setNextNode(Node nextNode) {  
        this.nextNode = nextNode;  
    }

}
