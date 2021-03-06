package com.livingoncodes.spring.springtutorial;

import javax.annotation.Resource;


public class Logger {

	private ConsoleWriter consoleWriter;

	private LogWriter fileWriter;

	@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Resource(name="demowriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);

	}

}
