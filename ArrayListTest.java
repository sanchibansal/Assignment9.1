import java.util.*;
class HDTV{
	String Brandname;			//creating class with properties brandname and size
	public int size;
	public HDTV(String Brandname,int size){			//parameterized constructor
		this.Brandname= Brandname;
		this.size= size;
	}
	public String getBrandname() {		//get method for brandname
		return Brandname;
	}
	public void setBrandname(String Brandname) {	//set method for brandname
		this.Brandname = Brandname;
	}
	public int getSize() {		//get method for size
		return size;
	}
	public void setSize(int size) {		//set method for size
		this.size = size;
	}
}
class ArrayListTest implements Comparator<HDTV>{		//implementing the comparator interface
	@Override
	public int compare(HDTV tv1, HDTV tv2) {
		// TODO Auto-generated method stub
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {				//comparing two values for size of tv
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
	public static void main(String args[]){
			ArrayList<HDTV> arr= new ArrayList<HDTV>();		//creating an arraylist
			HDTV hd1= new HDTV("LG",43);			//creating three objects for HDTV class
			HDTV hd2= new HDTV("sony", 32);
			HDTV hd3= new HDTV("micromax", 50);
			arr.add(hd1);				//adding the HDTV objects into ArrayList
			arr.add(hd2);
			arr.add(hd3);
			Collections.sort(arr, new ArrayListTest());		
			for (HDTV a : arr) {
				System.out.println(a.size+" "+a.getBrandname());	//printing values in ascending order
			}
	}
}
