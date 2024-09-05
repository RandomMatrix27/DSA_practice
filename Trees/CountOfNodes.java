package Trees;

public class CountOfNodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return leftSum+rightSum+root.data;
    }

    public static int heightNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = heightNodes(root.left);
        int rightHeight = heightNodes(root.right);
        int myHeight= Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int d1= diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = heightNodes(root.left) + heightNodes(root.right) +1;
        return Math.max(d3, Math.max(d1,d2));
    }

    static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Treeinfo diameter2(Node root){
        if(root ==null){
            return new Treeinfo(0,0);
        }
        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);
        int myheight = Math.max(left.ht,right.ht);

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht+1;
        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        Treeinfo myinfo = new Treeinfo(myheight,mydiam);
        return myinfo;
    }


    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.buildTree(arr);
        System.out.println(diameter2(root).diam);

    }
}
