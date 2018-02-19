package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class myTable {
	
	private Table<String,String,Integer> twoDimensionalFileMap= HashBasedTable.create();
	
	public int add(String curT, String pos, Integer sp){
		twoDimensionalFileMap.put(curT, pos, sp);
		return sp + 2;
	}
	 
}

