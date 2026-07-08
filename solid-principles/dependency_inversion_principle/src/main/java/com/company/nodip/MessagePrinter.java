package com.company.nodip;

import com.company.dip.Formatter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Scrive il messaggio su un file
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter(); // dipendenza concreta
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { // dipendenza concreta
			writer.println(formatter.format(msg)); // formattazione e scrittura
			writer.flush();
		}
	}
}
