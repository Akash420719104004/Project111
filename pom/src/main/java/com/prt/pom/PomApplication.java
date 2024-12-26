package com.prt.pom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTMLDocument;
import java.awt.print.Book;
import java.util.*;
@RestController
@SpringBootApplication
public class PomApplication {
	@GetMapping("/addNumber")
	public int addNumber(){
		int a=12;
		int b=24;
		return a+b;
	}
	public static void main(String[] args) {
//
//		List<Integer>integers= Arrays.asList(0,3,35,56);
////		Iterator<Integer>re= integers.iterator();
////		while (re.hasNext()){
////			System.out.println(re.next());
////		}
//		Queue<String> priorityQueue=new PriorityQueue<>();
//		priorityQueue.offer("saran");
//		priorityQueue.offer("kavi");
//		priorityQueue.offer("kaviya");
//		priorityQueue.offer("Nishanthi");
//		priorityQueue.offer("Nishanthi");
//		priorityQueue.offer("Akash");
//
//		System.out.println(priorityQueue);
//		for (String a:priorityQueue){
//			System.out.println(a);
//
//		}
//		LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
//		linkedHashSet.add("qwer");
//		linkedHashSet.add("qwe");
//		linkedHashSet.add("qwerrt");
//		linkedHashSet.add("qwerrt");
//	    Iterator<String>as= linkedHashSet.iterator();
//		while (as.hasNext()){
//			System.out.println(as.next());
//		}
//		PriorityQueue<String> queue=new PriorityQueue<String>();
//		queue.add("Amit Sharma");
//		queue.add("Vijay Raj");
//		queue.add("JaiShankar");
//		queue.add("Raj");
//		System.out.println("head:"+queue.element());
//		System.out.println("head:"+queue.peek());
//		System.out.println("iterating the queue elements:");
//		Iterator itr=queue.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//		queue.remove();
//		queue.poll();
//		System.out.println("after removing two elements:");
//		Iterator<String> itr2=queue.iterator();
//		while(itr2.hasNext()){
//			System.out.println(itr2.next());
//		}
//	  Queue<String>stringQueue=new PriorityQueue<>();
//		stringQueue.add("Nisha2");
//		stringQueue.add("Nisha3");
//		stringQueue.add("Nisha4");
//		stringQueue.add("Nisha1");
//		System.out.println("Fist Poll:"+stringQueue.poll());
//		System.out.println("Second Poll:"+stringQueue.poll());
//		System.out.println("Third Poll:"+stringQueue.poll());
//		System.out.println("Fourth Poll:"+stringQueue.poll());
//		System.out.println("Fifth Poll:"+stringQueue.poll());
//		System.out.println("Sixth Poll:"+stringQueue.poll());
//
//
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number a and b:");
//        int a=s.nextInt();
//		int a1=s.nextInt();
//		System.out.println(a+a1);
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		System.out.println(priorityQueue.remove());
//
//		integers.stream().peek(System.out::println);
//		List<Book>books=new ArrayList<>();
//		books.add(new Book(books.set()))
		SpringApplication.run(PomApplication.class, args);
	}


}
