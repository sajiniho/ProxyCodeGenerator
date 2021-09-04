package pkg;

import java.util.*;

public class ProxyCodeGenerator {
	public static void main(String[] args) {
		List<String> outputLines = new ArrayList<>();
		List<String> lines = IOCodeGen.input("input.txt");
		for (String line : lines) {
			if (line.contains("{")) {
				outputLines.add(line.replace(" {", ";"));
				outputLines.add("\n");
			}
		}
		IOCodeGen.output(outputLines, "output.txt");
	}
}
