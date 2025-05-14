package Tree;

public class BinarySearchTree {

	private TreeNode root;

	public BinarySearchTree() {
		
		root = null;
	}
	
	public BinarySearchTree(TreeNode r) {
	
		root = r;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void Insert_NonRecursive(int d)
	{
		TreeNode new_node = new TreeNode(d);
		
		if(root==null)
		{
			root=new_node;
			return;
		}
		
		TreeNode iter=root;
		
		while(true)
		{
			if(d<iter.getData())
			{
				if(iter.getLeft()==null)
				{
					iter.setLeft(new_node);
					return ;
				}
				else
				{
					iter=iter.getLeft();
				}
			}
			else if(d>iter.getData())
			{
				if(iter.getRight()==null)
				{
					iter.setRight(new_node);
					return;
				}
				else
				{
					iter=iter.getRight();
				}
			}
			else
			{
				System.out.println("Duplicate value can't be inserted...");
				return;
			}
		}
	}
	
	
	
	
	public void Insert_UseParent(int d)
	{
		TreeNode new_node = new TreeNode(d);
		
		if(root==null)
		{
			root=new_node;
			return;
		}
		
		TreeNode iter=root;
		TreeNode Parent;
		
		while(iter != null)
		{
			Parent = iter;
			if(d<iter.getData())
			{
				iter=iter.getLeft();
			}
			else if(d>iter.getData())
			{
				iter=iter.getRight();
			}
			else
			{
				System.out.println("Duplicate value can't be inserted...");
				return;
			}
			
			
			if(d<Parent.getData())
			{
				Parent.setLeft(new_node);
				return;
			}
			else
			{
				Parent.setRight(new_node);
				return;
			}
			
		}
		
		
	}
	/*************************Search************************************************/
	public TreeNode Search(int d) //Wrapper Class
	{
		return Search_rec(root,d);
	}
	
	
	private TreeNode Search_rec(TreeNode r,int d)
	{
		if(r==null)
		{
			return null;
		}
		if(d<r.getData())
		{
			return Search_rec(r.getLeft(),d);
			
		}
		else if(d>r.getData())
		{
			return Search_rec(r.getRight(),d);
		}
		return r;
	}
	
	
	/*************************Delete ************************************************/
	
	public void del(int d) //Wrapper Class
	{
		root=Del_rec(root,d);
	}
	
	private  TreeNode Del_rec(TreeNode r,int d)
	{
		TreeNode succ;
		if(r==null)
		{
			System.out.println("Empty Tree..");
			return null;
		}
		
		if(d<r.getData())
		{
			r.setLeft(Del_rec(r.getLeft(),d));
		}
		else if(d>r.getData())
		{
			r.setRight(Del_rec(r.getRight(),d));
		}
		else
		{
			if((r.getLeft()!=null)&&(r.getRight()!=null))
			{
				succ = r.getRight();
				while(succ.getLeft()!=null)
				{
					succ=succ.getLeft();
				}
				r.setData(succ.getData());
				r.setRight(Del_rec(r.getRight(),succ.getData()));
			}
			else
			{
				if(r.getLeft()!=null)
				{
					r=r.getLeft();
					
				}else if(r.getRight()!=null)
				{
					r=r.getRight();
				}
				else
				{
					r=null;
				}
			}
		}
		return r;
	}

	
	
	
	
	
	
}
