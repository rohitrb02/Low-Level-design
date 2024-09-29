package dip;

public class MacBook {
private final IMouse iMouse;
private final IKeyboard iKeyboard;

public MacBook(IMouse iMouse,IKeyboard iKeyboard) {
	this.iKeyboard = iKeyboard;
	this.iMouse = iMouse;
}

public void Test() {
	iMouse.bluetoothMouse();
	iMouse.wiredMouse();
	
	iKeyboard.bluetoothKeyboard();
	iKeyboard.wiredKeyboard();
}
}
