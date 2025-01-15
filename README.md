HackerRank Exercises
This repository contains solutions to HackerRank problems in Kotlin and Go. Each exercise is isolated in a separate file and can be executed independently.

How to Run the Exercises
1. Running Kotlin Exercises
Prerequisites
You need to have Kotlin installed on your system. If you haven't already, follow the installation instructions here: Kotlin Install.
You'll also need Java installed to run the .jar files generated from Kotlin. Kotlin compiles to Java bytecode, so Java is required to run the code.
Kotlin 3. Compile the Kotlin file using the kotlinc command. This will generate an executable .jar file:

kotlinc exercise.kt -include-runtime -d exercise.jar The kotlinc command compiles the .kt file (in this case, exercise.kt) into a .jar file named exercise.jar. The -include-runtime flag ensures that the Kotlin standard library is included in the .jar.

Run the compiled Kotlin file with the java -jar command: java -jar exercise.jar This will execute the code in the Kotlin file
1. Running Go Exercises
Prerequisites
You need to have Go installed on your system. If you don't have it yet, you can download and install Go from: Go Install. Step-by-step guide to run Go files: Navigate to the Go directory where the exercises are stored:

Run the go run command: go run exercise.go

Alternatively you could do:

Build the binary from the Go source code
go build exercise.go

This will generate an executable named 'exercise' (or 'exercise.exe' on Windows)
Run the binary directly
./exercise