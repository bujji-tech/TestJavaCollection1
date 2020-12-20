import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class TestJavaCollection1 {
public static void main(String  args[] ) {
	
ArrayList<String> al=new ArrayList<String>();

al.add("raja");
al.add("king");
al.add("raj");
al.add("bujji");
System.out.println("List1 "+al);
ArrayList<String> l=new ArrayList<String>();

l.add("raja");

l.add("king");
l.add("raj");
al.retainAll(l);
Spliterator<String> sp=l.spliterator();
sp.forEachRemaining((p)->
System.out.println(p));
System.out.println("hai welcome");

}

	}

