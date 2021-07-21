package utils;

import java.util.Date;

public class MyException extends Exception {
	
	class MessageException extends Exception {
		public MessageException(String message, Throwable reason) {
			super(message);
		}
	}
	
	class ReasonException extends Exception {
		public ReasonException(String reason) {
			super(reason);
		}
	}
	
	class StackTraceException extends Exception {
		public StackTraceException(String StackTrace) {
			super(StackTrace);
		}
	}
	
	class TimeException extends Exception {
		public TimeException(Date time) {
			
		}
	}
}

