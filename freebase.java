public class freebase {

    static class Node{

        public int data;
        public Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    static class List{
        public Node head;
        public Node tail;

        public List(){
            this.head=null;
            this.tail=null;
        }
        public void insert(int data) {
            Node node = new Node(data);


            if (head == null) {
                head = node;
            } else {
                Node n = head;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node;

            }
        }
        public void insertAtStart(int data){
            Node node = new Node(data);
            node.next=head;
            head=node;

        }
        public void show(){
            Node node =head;

                while (node!=null){
                    System.out.println(node.data);
                    node=node.next;

                }
            }


        }


    public static void main(String[] args) {
        List list = new List();
        list.insert(100);
        list.insert(101);
        list.insert(102);
        list.insertAtStart(69);
        list.show();


    }
}
