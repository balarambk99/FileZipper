package hello;

import java.util.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.awt.Point;
import java.io.*;
@WebServlet("/hoff")
@MultipartConfig
public class Hoffman  extends HttpServlet {
	static HashMap <Character,String>newcode=new HashMap<>();
	 static HashMap <String,Character>code=new HashMap<>();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{PrintWriter po=null;
		try { 
	po=response.getWriter();
		po.println("hello::");
		doPost(request, response);
		po.println("hello-entde");
		}catch (Exception e) {
			po.println("error ::hello"+e.getCause()+e.getMessage());
			// TODO: handle exception
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{  PrintWriter po=null;
		try{
			
			Part part=request.getPart("file");
		InputStream p=part.getInputStream();
		
		InputStream fi=p;	
				
		int a=0;
		String aString=request.getParameter("name");
	  
			ServletContext context=getServletContext(); 
                     String mt=null;
		 response.setContentType("application/octet-stream");

		  System.out.print("hello ");
		 
			
		
		 String hkString="Context-Disposition";
		 String g=String.format("attachement;filname=\"%s\"", aString);
		  context.setAttribute("my","hello");	
		 
	  	OutputStream o=response.getOutputStream();
	  	File kFile=compressFile(p);
		FileInputStream v=new FileInputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\balaram.jar");
		 response.setHeader(hkString, g);
		response.setContentLength(v.available());
		byte aa[]=v.readAllBytes();
	  	ObjectOutputStream objectOutputStream=new ObjectOutputStream(o);
	  	objectOutputStream.writeObject(aa);
	  objectOutputStream.writeObject(code);
	   for(int i=0;i<aa.length;i++)
		   System.out.println(aa[i]);
	  System.out.print(code);
	System.out.print("hello scuceefully file object ");
	  	
	  
	  				

		 }catch (Exception e) 
		{
			e.printStackTrace();
		 }
		
			
			
			
	}
	 File compressFile(InputStream p)
	{ InputStream v=null;
	  FileOutputStream fi=null;
		try {
			fi=new FileOutputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\myname.java");
			
			int a=0;
	          HashMap<Integer,Integer> h=new HashMap<>();
	          while((a=p.read())!=-1)
	          {
	            
	            fi.write(a);
	            if(h.get(a)!=null)
	             { h.put(a,h.get(a)+1);
	       
	             }
	            else  
	              h.put(a,1);
	          }
	          a=32;
	        	System.out.print(newcode);
	         // System.out.print("happ:"+h);
	         // System.out.print("my code"+newcode+" "+code);
	          v=new FileInputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\myname.java");
				
	           hoffman(h);
		}catch(Exception e)
		{  
			String aString=e.getMessage();
			
		}
		finally{
			
//			
			return compress(v);
			
		}
	}
	
	 public static void hoffman(HashMap<Integer,Integer>h)
	    {
	      PriorityQueue<Node>q=new PriorityQueue<>(5,new ComNode());
	          Set<Integer> s=h.keySet();
	          for(int aa:s)
	          {
	            q.add(new Node((char)aa, h.get(aa)));
	          }
	        
	        Node myTree=myTree(q);
	        myCode(myTree,"");
	    }
	
	 public static void myCode(Node tree,String a)
	    {  if(tree==null)
	         {  
	          return;
	         }
	         else if(tree.left==null&&tree.right==null)
	           {
	        	 code.put(a,tree.a); 
	            newcode.put(tree.a,a);

	        }
	       myCode(tree.left,a+"0");
	       myCode(tree.right, a+"1");

	    }

	 public static void decompress()
	    {  FileInputStream fi=null;
	      FileOutputStream h=null;
	 
	      try
	      {
	       	        h=new FileOutputStream("C:\\Users\\balar\\OneDrive\\Desktop\\myname.txt");
	        int a=0;	       
	        StringBuffer s=new StringBuffer();
	        while((a=fi.read())!=-1)
	        {  String x=Integer.toBinaryString(a);
	          for(int i=x.length();i<8;i++)
	            x="0"+x;
	          s.append(x);
	         
	          
	        }
	   
	        String sa="";
	  
	        for(int i=0;i<s.length();i++)
	        {   sa=sa+s.charAt(i);
	       
	              if(code.get(sa)!=null)
	              {char l=code.get(sa);
	                
	                h.write(l);
	                sa="";
	              }
	        }
	        
	        
	       
	      }catch(Exception e)
	      {
	       e.printStackTrace();
	      }



	    }
	 static  File compress(InputStream l)
     {
    
		 FileOutputStream fi=null;
      
       try{
         fi= new FileOutputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\balaram.jar");
           int a=0;
           StringBuffer str=new StringBuffer();
           while((a=l.read())!=-1)
           {   
            str.append(newcode.get((char)a));
           }
           ;
           StringBuffer fB=new StringBuffer();
        for(int i=0;i<str.length();i=i+8)
           {  try{
            int k=Math.min(i+8,str.length());
           String su=str.substring(i, k);
          int y=Integer.parseInt(su,2);
          System.out.println("oh:"+y+" "+(char)y);
          fi.write((char)y);
          fB.append(su);
           }
     catch(NumberFormatException e)
         { e.printStackTrace();
         }

        }
        // p.print("scess:<br>"+str);
        }
       catch(Exception e)
     {
       e.printStackTrace();
     }
       finally {
    	    try{FileInputStream f=new FileInputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\balaram.jar");
    	     int a=0;
    	     StringBuilder s=new StringBuilder();
    	     
//    	     while((a=f.read())!=-1)
//    	     {
//    	    	 s.append(a);
//    	     }
    	    
    	    }catch(Exception e)
    	    {
    	    	e.printStackTrace();
    	    }
    	    
    	   File gFile=new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\work\\balaram.jar");
		return gFile;
	}
     }

	
	public static Node myTree(PriorityQueue <Node>a)
    {
        while(a.size()>=2&&a.size()!=0)
        {
          Node leftNode=a.poll();
          Node rightNode=a.poll();
          Node root=new Node(leftNode.b+rightNode.b,leftNode,rightNode);
          a.add(root);

        }
        return a.poll();
    }

}
class Node{
	  char a;
	  int b;
	  Node left;
	  Node right;
	  public Node(int b,Node left,Node right)
	  {
	    this.b=b;
	    this.left=left;
	    this.right=right;
	  }
	  public Node(char a,int b)
	  {
	    this.a=a;
	    this.b=b;
	    this.left=null;
	    this.right=null;
	  }

	}
class NewFile extends FileInputStream implements Serializable
{
	public NewFile(String a) throws IOException 
	{
		super(a);
	}
}

	class ComNode implements Comparator<Node>{
	  public int compare(Node s1, Node s2) {
	                if (s1.b < s2.b)
	                    return -1;
	                else if (s1.b> s2.b)
	                    return 1;
	                                return 0;
	                }
	

}
	
