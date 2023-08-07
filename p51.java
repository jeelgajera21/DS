import java.util.*;

public class p51{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	Linkedlist ll=new Linkedlist();
	

	ll.addfirstNode(9);
	ll.addlastNode(10);
	ll.addfirstNode(8);
	ll.deletefirstNode();
	ll.deletelastNode();
	ll.printNode();
	}
}

class Node{
	int value;
	Node link;


	Node(int data){
		this.value=data;
		this.link=null;
	}
}

class Linkedlist{

	Node first;

	void addfirstNode(int data){
		Node newnode=new Node(data);

		newnode.link=first;
		first=newnode;
	}

	void addlastNode(int data){
		Node newnode=new Node(data);

		if(first==null){
			first=newnode;
		}

		else{
		Node save=first;

		while(save.link != null){
			save=save.link;
		}
			save.link=newnode;
		}
	}

	void deletefirstNode(){
		
		if(first.link==null){
			first=null;
		}
		else{
			first=first.link;
		}

	}

	void deletelastNode(){
		Node save=first;

		while(save.link.link != null){
			save=save.link;
		}
		save.link=null;

	}

	void printNode(){
		Node save=first;

		while(save.link!=null){
				System.out.print(save.value);
				System.out.println(" "+save.link);
				save=save.link;
		}
		System.out.print(save.value);
		System.out.println(" "+save.link);
	}


	
}