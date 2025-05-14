package TreeMir;

public class TreeNode {
	private int data;
	private TreeNode left,right;
	public TreeNode() {
		data=0;
		left=right=null;
	}
	
	public TreeNode(int d) {
		data=d;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	
	

}
