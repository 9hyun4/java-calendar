package calendar.exam10;

import java.io.*;
import java.util.*;

public class Content {
	private List<String> content;
	
	public List<String> getContent() {
		return content;
	}

	public void setContent() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		content = new ArrayList<>();
		
		try {
			
			while(true) {
				String str = br.readLine();
				if(str.contains(";")) {
					String tmp = str.replace(";", "");
					content.add(tmp);
					return;
				} else {
					content.add(str);
				}
			}
			
			
			
		} catch (Exception e) {

		}
		
	}
	
	public void printContent() {
		for (int i=0; i<content.size(); i++) {
			System.out.println(content.get(i));
		}
	}
	

}
