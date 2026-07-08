package com.company.nodip;

import com.company.dip.Formatter;
import com.company.dip.Writer;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new JSONFormatter();
        Writer writer = new FileWriterWriter("report.json");
        writeReport(formatter, writer);
    }

    public void writeReport(Formatter formatter, Writer writer) {
        Report report = new Report();
        // build the report
        String reportString = formatter.format(report);
        writer.write(reportString);
    }
}

