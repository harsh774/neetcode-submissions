class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = right;
        this.right.prev = left;

    }
    
    public int get(int key) {
           if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        delete(node);
        insert(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            this.delete(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);

        this.insert(newNode);
        if(this.cache.size() > this.capacity){
            this.cache.remove(this.left.next.key);
            this.delete(this.left.next);
        }
    }

    private void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    private void delete(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

class Node{
    private int key;
    private int value;
    private Node next;
    private Node prev;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
