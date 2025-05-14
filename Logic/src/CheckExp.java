
public class CheckExp {

	public static boolean match (char c1,char c2)
	{
		if(((c1=='(')&&(c2==')'))||((c1=='{')&&(c2=='}'))||((c1=='[')||(c2==']')))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean CheckExp(String exp)
	{
		int i;
		char temp;
		CharStack st=new CharStack(50);
		
		for(i=0;i<exp.length();i++)
		{
			if((exp.charAt(i)=='[')||
			  (exp.charAt(i)=='{')||
			  (exp.charAt(i)=='('))
			  {
				st.push(exp.charAt(i));
			  }
			if((exp.length()==']')||
			   (exp.length()=='}')||
			   (exp.length()==')'))
			{
				if(st.isEmpty())
				{
					return false;
				}
				temp=st.pop();
				if(!match(temp,exp.charAt(i)))
				{
					return false;
				}
			}
			if(st.isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
}
