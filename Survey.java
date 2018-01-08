public class Survey{

	private char[] answers;
	private int numberOfStudents;
	private char[][] responses;
	private int[] scores;
	private int count = 0;

	public Survey(char[] target, int students){
		numberOfStudents = students;
		answers = target;
		responses = new char[numberOfStudents][answers.length];
		scores = new int[answers.length];
	}


	public void submit(char[] studentAnswers){		
		responses[count] = studentAnswers;
		tally(responses[count]);
		count++;
	}

	private void tally(char[] studentAnswer){
		for(int i=0; i<answers.length; i++){
			if(studentAnswer[i] == answers[i]){
				scores[count] += 1;
			}

		}

	}

	public char[] getAnswers(){
		
		return answers;

	}

	public char[][] getResponses(){
		
		char[][] temp = new char[count][answers.length];
		for(int i =0; i < count; i++){
			temp[i] = responses[i];
		}
		
		return temp;
	}

	public int getScores(int n){

		int[] temp = new int[count];
		for(int i = 0; i<count; i++){
			temp[i] = scores[i];
		}
		return temp[n];

	}
	
}
