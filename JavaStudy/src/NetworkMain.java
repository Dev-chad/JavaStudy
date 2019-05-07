import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class NetworkMain {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("https://dhlottery.co.kr/gameResult.do?method=byWin");
		
		int startIdx = result.indexOf("num win");
		int endIdx = result.indexOf("</p>", startIdx);
		String data = result.substring(startIdx, endIdx);
		String lotto = "";
		endIdx = 0;
		while(true)
		{
			startIdx = data.indexOf("<span class=", endIdx);
			
			if(startIdx == -1) {
				break;
			}
			
			startIdx = data.indexOf(">", startIdx);
			
			endIdx = data.indexOf("<", startIdx);
			
			lotto += String.format("%02d ", Integer.parseInt(data.substring(startIdx+1, endIdx)));
		}
		
		System.out.println(lotto);
		/*NetworkUtil networkUtil = new NetworkUtil();
		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(new URL("https://chart.googleapis.com/chart?cht=qr&chs=200x200&chl=%EC%9E%84%EC%9A%A9%EC%9A%B4"));
			ImageIO.write(bufferedImage, "PNG", new File("qr.png"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}
}
