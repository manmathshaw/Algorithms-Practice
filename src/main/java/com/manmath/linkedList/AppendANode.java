package com.manmath.linkedList;

public class AppendANode {
	public static void main(String[] args) {
		Node a = new Node(1,null);
		Node b = new Node(2,null);
		Node c = new Node(3,null);
	//	Node d = new Node(4,null);
	//	appendAtLast(5,a);
		a.next=b;
		b.next=c;
		
		a.printList();
	}
	private static Node appendAtLast(int val, Node header){
		Node current = header;
		while(header !=null){
			header = header.next;
		}
		header.next= new Node(val,null);
		return current;
	}
	
	public Node appendAtHead(int value, Node head){
		Node newNode = new Node(value, null);
		newNode.next=head;
		head = newNode;
		return head;
	}
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int val,Node n){
			this.data=val;
			this.next=n;
		}
		public void printList(){
			Node head = this;
			while(head != null){
				System.out.println(head.data+"->");
				head = head.next;
			}
			System.out.println();
		}
	}
	
}
