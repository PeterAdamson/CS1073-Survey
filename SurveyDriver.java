import java.util.Arrays;

public class SurveyDriver{

	public static void main(String[] args){


		char[] a = {'A','D','B','B','C'};
		char[] b = {'A','D','B','C','C'};
		char[] c = {'A','D','B','B','C'};
	
		Survey s = new Survey(a, 3);
		char[][] d = s.getResponses();
		s.submit(b);
		s.submit(c);
		System.out.printf("Optimal Responses: ");
		System.out.printf("%s%n",Arrays.toString(s.getAnswers()));
		System.out.printf("---------------------%n");
		for(int i=0; i<a.length; i++){
			int counter = i+1;
			System.out.printf("Respondent %d %s: %d/%d%n", counter, Arrays.toString(d[i]),  s.getScores  				(i), s.getAnswers().length);
		}
	}

}
