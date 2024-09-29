package Cbdp;

import java.util.Stack;

public class MyRemoteControl {
	Stack<ICommand> acCommandHistory = new Stack<ICommand>();
	ICommand command;
	
	MyRemoteControl(){	
	}
	
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
		acCommandHistory.add(command);
	}
	
	public void undo() {
		
		if(!acCommandHistory.empty()) {
			ICommand lastCommand = acCommandHistory.pop();
			lastCommand.undo();
		}
	}
}
