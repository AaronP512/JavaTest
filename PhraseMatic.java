public class PhraseMatic{
	public static void main(String[] args) {
		String[] wordListOne= {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","frontend","web- based","pervasive","smart","sixsigma","critical-path","dynamic"};
		String[] wordListTwo={"empowered", "sticky","value-added","oriented","centric","distributed","clustered","branded","outaide-the-box","positioned","networked","focused" ,"leveraged","aligned","targeted","shared","cooperative","accelerated"};
		String[] wordListThree = {"process","tippingpoint","solution","architecture","core competency","strategy","mindshare","portal","apace","vision","paradigm","mission"};
		int one = wordListOne.length;
		int two = wordListTwo.length;
		int three = wordListThree.length;
		int rand1= (int)  (Math.random()*one);
		int rand2= (int)  (Math.random()*two);
		int rand3= (int)  (Math.random()*three);
		String phrase= wordListOne[rand1]+" " +wordListTwo[rand2]+" "+wordListThree[rand3] ;
		System.out.println("What we need is a " + phrase);
	}
}