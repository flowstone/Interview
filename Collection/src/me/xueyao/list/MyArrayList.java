package me.xueyao.list;

/**
 * 我的ArrayList
 * @author XueYao
 *
 */
public class MyArrayList {
	Object[] objs = new Object[4];
	//集合的大小
	int size = 0;
	
	public int size(){
		return size;
	}
	
	//添加
	public void add(Object value){
		//判断
		if (size >= objs.length) {
			Object[] temp = new Object[objs.length*2];
			//搬家
			for (int i = 0; i < objs.length; i++) {
				temp[i] = objs[i];
			}
			objs = temp;
		}
		objs[size] = value;
		size++;
	}
	
	//设置数据
	public void set(int index, Object value){
		if (index < size && index > -1) {
			objs[index] = value;
		}
	}
	
	//获得数据
	public Object get(int index) throws Exception{
		
		if (index >= size && index < 0) {
		 throw new Exception("超出范围");
		}
		return objs[index];
	}
	
	public void clear(){
		size = 0;
		objs = new Object[4];
	}
	
	public void removeAt(int index) throws Exception{
		if (index < 0 || index >= size) {
			throw new Exception("超出范围");
		}
		
		for (int i = index + 1; i < size; i++) {
			objs[i-1] = objs[i];
		}
		size--;
	}
}
