package pt.pragmapilot.linkedlist;

/**
 * Implements a singly linked list. 
 *
 * Usage:
 * 
 * LinkedList list = new LinkedList();
 *		
 * list.add("1");	
 * list.add("2");
 * list.add("3");
 * list.add("4");
 * list.add("5");
 *
 * System.out.println("list: " + list);
 * System.out.println("size: " + list.size());
 * System.out.println("fetch third element: " + list.get(3));
 * System.out.println("remove second element: " + list.remove(2));
 * System.out.println("fetch third element: " + list.get(3));
 * System.out.println("size: " + list.size());
 * System.out.println("list: " + list);
 * 
 */
public class LinkedList {
	/* First node */
	private Node head;
	/* Number of nodes */
	private int nodeCount;
	
	/**
	 * Default ctor. 
	 */
	public LinkedList()
	{
		this.head = new Node(null);
		this.nodeCount = 0;
	}

	/**
	 * Adds the given object to the end of the list.
	 * @param value the value to add
	 */
	public void add(Object value)
	{
		Node node = head;
		Node newNode = new Node(value);
		
		while(node.getNext() != null)
		{
			node = node.getNext();
		}
		
		node.setNext(newNode);
		nodeCount++;
	}

	/** 
	 * Inserts the given object at the given position.
	 * @param value the value to insert
	 * @param index the position where the insertion will take place
	 */
	public void add(Object value, int index)
	{
		if(index > 0 && index < nodeCount)
		{
			Node node = head;
			Node newNode = new Node(value);

			for (int i = 0; i < index; i++)
			{
				node = node.getNext();
			}

			node.setNext(newNode);
			nodeCount++;
		}
	}

	/**
	 * Fetch the value at the given position.
	 * @param index the position
	 * @return the value at the given position
	 */
	public Object get(int index)
	{
		Object result = null;
		
		if(index > 0 && index < nodeCount)
		{
			Node node = head;
			
			for (int i = 0; i < index; i++)
			{
				node = node.getNext();
			}

			result = node.getValue();
		}
		
		return result;
	}

	/** Removes the value at the given position.
	 * @param index the position
	 * @return true if the deletion was successful, false oo
	 */
	public boolean remove(int index)
	{
		boolean result = false;
		
		if(index > 0 && index < nodeCount)
		{
			Node node = head;
			
			for (int i = 0; i < index; i++)
			{
				node = node.getNext();
			}
			
			node.setNext(node.getNext().getNext());
			this.nodeCount--;
			result = true;
		}
		
		return result;
	}

	/**
	 * Returns the size of the list.
	 * @return the list size
	 */
	public int size()
	{
		return  this.nodeCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		Node node = head.getNext();
        String output = "";
        while (node != null) {
            output += "[" + node.getValue().toString() + "]";
            node = node.getNext();
        }
        return output;
	}
	
	/**
	 * Internal data structure that abstracts a node of the linked list.  
	 */
	/**
	 * @author Rodas
	 *
	 */
	private class Node {
		/* Points to the next node. */
		private Node next;
		/* Stores the value. */
		private Object value;
		
		/**
		 * Default ctor.
		 * @param value the value 
		 */
		public Node(Object value)
		{
			this.next = null;
			this.value = value;
		}
		
		/**
		 * Accesses the next node.
		 * @return the next node
		 */
		public Node getNext()
		{
			return next;
		}
		
		/** Modifies the next node.
		 * @param newNext the new next node
		 */
		public void setNext(Node newNext)
		{
			if(next != newNext)
			{
				next = newNext;
			}
		}
		
		/**
		 * Accesses the stored value.
		 * @return the value 
		 */
		public Object getValue()
		{
			return value;
		}
	}
}