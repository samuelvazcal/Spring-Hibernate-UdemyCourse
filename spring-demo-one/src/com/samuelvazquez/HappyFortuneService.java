package com.samuelvazquez;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		String [] array = {"You Can Do It!","Impossible Is Nothing","Believe In You",
				"No Limits!","You're the best!"};
		Random random = new Random();
		int index = random.nextInt(5);
		//System.out.println(array[index]);
		return array[index];
		
		
	}
	
}
