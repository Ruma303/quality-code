package com.company.dip;

public class MessagePrinter {

	// Scrive il messaggio tramite le astrazioni fornite (formatter e writer)
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
		writer.println(formatter.format(msg)); // utilizza l'astrazione
		writer.flush();
	}
}