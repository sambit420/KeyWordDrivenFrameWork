
package keywordLogin;
import org.testng.annotations.Test;

import keywordengine.KeywordEngine;

public class LoginTest {
	
	
		
		public KeywordEngine keywordEngine;
			@Test
			public void loginTest() {
				 keywordEngine = new KeywordEngine();
				 keywordEngine.startExecution("login");
			}

		}
	