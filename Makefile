build:
	find -name "*.java" > sources.txt
	javac -cp src:test:lib/junit-4.7.jar @sources.txt -d bin

run:
	java -cp bin:lib/junit-4.7.jar TestRunner

clean:
	rm * bin
