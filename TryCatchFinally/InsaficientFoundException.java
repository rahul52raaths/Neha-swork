package com.TryCatchFinally;

public class InsaficientFoundException extends Exception{

	public InsaficientFoundException() {
		super("minimum balance should be greater than 500 otherwise you can't withdrow");
	}
}
