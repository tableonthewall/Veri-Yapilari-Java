class StackNew{
	int capacity=2;
	int[] dizi=new int[capacity];
	int top=0;
	
	public void push(int data) {
		if(top>=capacity) {
			//Dizinin boyutunu genişletmek için:
			int [] dizi2=new int[capacity*2];
			for(int i=0;i<top;i++) {
				dizi2[i]=dizi[i];
			}
			dizi=dizi2;
			capacity*=2;
		}
			dizi[top]=data;
			top+=1;		
	}
	
	public int pop() {
		if(top==0 || dizi==null) {
			System.out.println("Dizi boş");
			return -1;
		}
		if(capacity/2>=top) {
			//Eğer dizinin eleman sayısı kapasitesinin yarısının altına düşmüşse:
			int []dizi3=new int[capacity/2];
			for(int i=0;i<top;i++) {
				dizi3[i]=dizi[i];	
			}
			dizi=dizi3;
			capacity/=2;
		}
			top=top-1;
			return dizi[top];
		}

	public void show() {
		for(int i=0;i<top;i++) {
			System.out.println(dizi[i]);
		}
	}
	public int size() {
		return top;
	}
	public int capacity() {
		return capacity;
	}
}
//Uygulama örneği
public class StackSadiHoca {
	public static void main(String args[]) {
		StackNew sh=new StackNew();
		System.out.println("push");
		sh.push(10);
		sh.push(10);
		System.out.println("dizinin kapasitesi: "+sh.capacity());
		sh.push(2);
		sh.push(5);
		sh.push(25);
		sh.push(13);
		sh.push(101);
		sh.push(140);
		sh.push(60);
		System.out.println("**********SHOW*************");
		sh.show();
		System.out.println("dizinin boyutu: "+sh.size());
		System.out.println("dizinin kapasitesi: "+sh.capacity());
		System.out.println("pop işlemi");
		System.out.println(sh.pop());
		System.out.println(sh.pop());
		System.out.println(sh.pop());
		System.out.println(sh.pop());
		System.out.println("**********SHOW*************");
		sh.show();
		System.out.println("dizinin boyutu: "+sh.size());
		System.out.println("dizinin kapasitesi: "+sh.capacity());,
		//Oluşturacağımız bir stack dizisini tersine çevirme
		StackNew sn=new StackNew();
		for(int i=0;i<10;i++) {
			sn.push(i*10);
		}
		sn.show();
		StackNew sn2=new StackNew();
		/*
		for(int i=0;i<10;i++) {
			System.out.println(sn.pop());
		}
		*/
		//sn yığınını tersine çevirmek için: (her bir elemanı pop edersek sırayla diğerine pop edilen değer sırasıyla push edilir.)
		for(int i=0;i<10;i++) {
			sn2.push(sn.pop());
			//sn2.show();
		}
		sn2.show();
	}
}
