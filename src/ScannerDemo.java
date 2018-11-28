import java.util.*;
		public class ScannerDemo{

			private static String file1 = "C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";
			private static int counter = 1;

			public static void main(String args[]) {

				TokenStream ts = new TokenStream(file1);

				System.out.println(file1);

				while (!ts.isEndofFile()) {
					// TO BE COMPLETEDs
					System.out.println("Token" + counter + ":" +
					ts.nextToken().toString());
					counter += 1; 
				}
			}
		}


	


