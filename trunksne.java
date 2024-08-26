package dsfsdf;

import java.util.ArrayList;
public class trunksne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[]=new int[] {-1, 1,-5,-8,5};
		int k=0;
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
	    ArrayList<String> arrayList2=new ArrayList<String>();
		if(k==0) {
			int count=0;
			Boolean kt=true;
			for(int i=0;i<M.length;i++) {
				if(M[i]==0) {;
					count++;
					break;
				}
			}
			for(int i=0;i<M.length;i++) {
				if(M[i]<0) {
					kt=false;
					break;
				}
			}
			if(count==M.length && kt==false) {
				tatcacactohopcacso(M, k,arrayList,arrayList2);
			}
			else if (count==M.length && kt==true) {
				System.out.println("Không có giá trị nào cộng lại bằng "+k);
			}
			else if (count!=M.length && kt==false) {
				tatcacactohopcacso(M, k,arrayList,arrayList2);
			}
		}
		else {
			tatcacactohopcacso(M, k,arrayList,arrayList2);
		}
	}
	private static void tatcacactohopcacso(int[] M, int k,ArrayList<Integer> arrayList,ArrayList<String> arrayList2) {
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<=k/M[i];j++) {
				arrayList.add(M[i]);
			}
		}
		M=new int[arrayList.size()];
		for(int i=0;i<arrayList.size();i++) {
			M[i]=arrayList.get(i);
		}
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M.length-1;j++) {
				int count2=0;
				while(count2<M.length) {
					int count=0;
					while(count<M.length-count2) {
						String m="";
						int sum=0;
						for(int i1=count;i1<=count+count2;i1++) {
							if(M[i1]<0) {
								m+=""+"("+M[i1]+")"+"+";
							}
							else {
								m+=""+M[i1]+"+";
							}
							sum+=M[i1];
						}
						count++;
						if(sum==k && !arrayList2.contains(m)) {
							arrayList2.add(m);
						}
					}
					count2++;
				}
				int teamp=M[j];
				M[j]=M[j+1];
				M[j+1]=teamp;
			}
		}
		if(arrayList2.size()==0) {
			System.out.println("Không có giá trị nào cộng lại bằng "+k);
		}
		else {
			for (String string : arrayList2) {
				System.out.println(string.substring(0,string.lastIndexOf("+"))+"="+k);
			}
		}
	}
}
