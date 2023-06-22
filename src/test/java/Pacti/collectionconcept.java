package Pacti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;





public class collectionconcept
{
	public static void main(String[] args) 
	{
//		ArrayList<Object> a = new ArrayList<Object>();
//		a.add(null);
//		a.add("hello");
//		a.add("hi");
//		a.add(10);
//		a.add(a);
//		System.out.println(a);
//		if(a.contains("hello"))
//		{
//			System.out.println("is a prseent");
//		}else
//		{
//			System.out.println("not prsent");
//		}
//
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(46);
//		a1.add(40);
//		a1.add(45);
//		System.out.println(a1);
//		Collections.sort(a1);
//		System.out.println(a1);
//
//		Collections.sort(a1,Collections.reverseOrder());
//		{
//			System.out.println(a1);
//		}
//
//		ArrayList<Object> a2 = new ArrayList<Object>();
//		a2.add(55);
//		a2.add(56);
//		a2.add("heelo");
//		a2.add("bye");
//		a2.add(null);
//		a2.add(45);
//		System.out.println(a2.get(3));
//		System.out.println(a2.remove(2));
//		System.out.println(a2.remove("hello"));
//
//		for(      Object value:a2)
//		{
//			System.out.println(value);
//		}
//		Iterator<Object> it = a2.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//
//
//		LinkedHashSet<Object> se1 = new LinkedHashSet<Object>();
//		
//		se1.add("hi");
//		se1.add("hhh");
//		se1.add(10);
//		se1.add(45);
//		System.out.println(se1);
//
//		PriorityQueue<Object> s1 = new PriorityQueue<Object>();
//		s1.add("tata");
//		s1.add("bye");
//		s1.add("bata");
//		s1.add("baaa");
//		System.out.println(s1.peek());
//		System.out.println(s1);
//		System.out.println(s1.poll());
//		System.out.println(s1);
//
//		PriorityQueue<Integer> s12 = new PriorityQueue<Integer>();
//		s12.add(4);
//		s12.add(5);
//		s12.add(6);
//		s12.add(7);
//		System.out.println(s12.peek());
//		System.out.println(s12);
//		System.out.println(s12.poll());
//		System.out.println(s12);
//
//		HashSet<Object> se = new HashSet<Object>();
//		se.add(10);
//		se.add(10);
//		se.add("hi");
//		se.add("hi");
//		se.add(null);
//		se.add(null);
//		System.out.println(se);
//		System.out.println(se.size());
//		System.out.println(se.isEmpty());
//		
//		
//		
//		LinkedHashSet<Object> s2 = new LinkedHashSet<Object>();
//		s2.add("benze");
//		s2.add("benze");
//		s2.add("benzf");
//		s2.add(10);
//		s2.add(null);
//		s2.add(10);
//		s2.add(null);
//		System.out.println(s2);
//		
//		TreeSet<Object> see = new TreeSet<Object>();
//	    see.add(10);
//	    see.add(23);
//	    see.add(10);
//	    see.add(30);
//	    see.add(66);
//	    System.out.println(see);
//	    
//	    //Map
//	      Hashtable<String, Integer> t = new Hashtable<String,Integer>();
//	           t.put("hi",8);
//	           t.put("bi",20);
//	           t.put("hi",8);
//	           t.put(null, null);// null not allows nullpointer exception
//	        System.out.println(t);
////	           
////	           for(    Entry<String, Integer> t1:t.entrySet())
////	           {
////	        	System.out.println( t1.getKey()+""+t1.getValue());
////	        	
////	           }
////	           System.out.println(t.contains("bi"));
////	           System.out.println(t.remove("bi",20));
////	           System.out.println(t.get(8));
////	           System.out.println(t);
//	           
//			           
//			                   HashMap<String, Object> m = new HashMap<String,Object>();
//			                   m.put("hello",20);
//			                   m.put("hello",26);
//			                   m.put(null,'a');
//			                   m.put(null,'b');
//			                   m.put(null, null);
//			                   
//			                   System.out.println(m);
			                 //  System.out.println(m.remove("hello",26));
			                 //  System.out.println(m);
		//	                    
		//	                            HashMap<Integer, Integer> m1 = new HashMap<Integer,Integer>();
		//	                            m1.put(10 ,10);
		//	                            m1.put(60,50);
		//	                            System.out.println(m1);
		//	                            System.out.println(m1.replace(10 ,2));
		//	                            System.out.println(m1);
		//	                            
		//	                            
//		PriorityQueue<Object> p = new PriorityQueue<Object>();
//		p.add("hi");
//		p.add("bi");
//		p.add(10);
//		System.out.println(p);   // not print bcz can't store heterogeneous type date through class cast exception
//
//       Stack<Object> s = new Stack<Object>();
//       s.push(23);
//       s.push(25);
//       s.push("hi");
//       System.out.println(s.pop());
//       System.out.println(s.push(34));
       
//       LinkedHashMap<String, Object> h = new LinkedHashMap<String, Object>();
//       h.put("hi", 10);
//       h.put("bi",25);
//       h.put("ji",10);
//       h.put(null, 20);
//       h.put(null, 210);
//       System.out.println(h);
		
		
		    TreeMap<String, Object> tm = new TreeMap<String, Object>();
		    tm.put("hi",10);
	//	    tm.put(null, null);
		    tm.put("hi",9);
		    tm.put("bi", 15);
		    System.out.println(tm);
       






	}

}
