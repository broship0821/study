package project;

import java.util.Arrays;

public class QuestionVO {
	private String question;
	private String[] buttons;
	private String rightAnswer;
	
	public QuestionVO() {}
	public QuestionVO(String question, String[] buttons, String rightAnswer) {
		this.question = question;
		this.buttons = buttons;
		this.rightAnswer = rightAnswer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getButtons() {
		return buttons;
	}
	public void setButtons(String[] buttons) {
		this.buttons = buttons;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	@Override
	public String toString() {
		return "QuestionVO [question=" + question + ", buttons=" + Arrays.toString(buttons) + ", rightAnswer="
				+ rightAnswer + "]";
	}
	
	
}
