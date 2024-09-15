class  MainED
{
	public static void main(String[] args) 
	{
		D d1 = new E();			//this is implicit upcasting
		System.out.println(d1.k);
		E e1 = (E)d1;	//downcasting
		System.out.println(e1.k);
		System.out.println(e1.j);

	}
}
/* in upcasting ...two types of upcastings are there ...they are explicit upcasting
and implicit up casting.....
examples:
D d1 = (D) new E();-->this is explicit upcasting
D d1 = new E();-->this is implicit upcasting..
there is only one super class so we can do implicit upcasting directly(i.e.,automatically compiler can 
perform action and execute the output without the developer(me) giving (D)...) is called implicit upcasting...*/

/*they may have chance to have more subclasses but there is only one super class...because of having
more then one subclass developer shoud give the (E) in the downcasting*/




