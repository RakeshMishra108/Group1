package generic;

import java.util.LinkedList;

public class GenericTest2 {
public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		
		MyValues mi = new MyValues(10, 20);
		mi.print();
		mi.swap();
		mi.print();
		System.out.println("------------------");

		MyValues<Float> mf = new MyValues<Float>(20.45f, 50.67f);
		mf.print();
		mf.swap();
		mf.print();
		
		MyValues s1 = new MyValues("My Heart Will Go On","Titanic","Celine D",1997);
		MyValues s2 = new MyValues("My Heart Will Go On","Titanic","Celine D",1997);
		s1.print();
		s2.swap();
		s1.print();
		
		System.out.println("------------------");
		jukeBox.print();
		jukeBox.swap();
		jukeBox.print();	
	}
}

class MyValues<AnyType>
{
	AnyType x;
	AnyType y;
	AnyType s1;
	AnyType s2;
	AnyType Song;
	
	MyValues(AnyType x,AnyType y,AnyType Song,AnyType s1,AnyType s2) {
		this.x=x;
		this.y=y;
		this.Song= Song;
		this.s1=s1;
		this.s2=s2;
	}
	MyValues(String title,String album,String artist,int year) {
//		s1 =("My Heart Will Go On","Titanic","Celine D",1997);
//		y = ("Zhingat","Sairat","Ajay Atul",2016);
	}
	
	MyValues(AnyType x,AnyType y) {
		this.x=x;
		this.y=y;
	}
	
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
	}
	void swap() {
		System.out.println("swapping....");
		AnyType temp=x; x=y;y=temp;
		System.out.println("swapped...");
		
		System.out.println("swapping....");
		AnyType temp1=s1; s1=s2; s2=temp1;
		System.out.println("swapped...");
	}


/*
class MyIntegers
{
	int x;
	int y;
	
	MyIntegers(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}

class MyFloats
{
	float x;
	float y;
	
	MyFloats(float x,float y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		float temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}


class MySongs
{
	Song x;
	Song y;
	
	MySongs(Song x,Song y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		Song temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}
*/
//class Song
//{
//	String title;
//	String album;
//	String artist;
//	int year;
//	
//	public Song(String title, String album, String artist, int year) {
//		super();
//		this.title = title;
//		this.album = album;
//		this.artist = artist;
//		this.year = year;
//	}
//	@Override
//	public String toString() {
//		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
//	}
//	
	
}

