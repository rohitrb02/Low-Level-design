package dip;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IMouse iMouse = new Mouse();
         IKeyboard iKeyboard = new Keyboard();
		
		MacBook macBook = new MacBook(iMouse,iKeyboard);
		macBook.Test();
	}

}
