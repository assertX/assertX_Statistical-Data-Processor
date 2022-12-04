# assertX_Statistical_Data_Processor
In this project, you are going to write a Java program that does some statistical data processing.  You need to store the input data from an input file in an ArrayList, and write the statistical results to an output file.

•The input file is a plain text file (filename: data.txt).

•In the input file, each row contains exactly 2 floating-point values (except for those empty lines).  The first value is the x-value; the second value is the y-value.  In other words, each row in the input file stores an x-y pair.

•You cannot assume (or guess) the number of x-y pairs in the input file.  In other words, no matter how many x-y pairs are stored in the input file, your program should correctly process all of them.

•There are may be empty lines at the beginning, in the middle, and/or at the end of the input file.  Your program should smartly skip those empty lines.



•The output file is a plain text file (filename: results.txt).

•The following statistical results should be written to the output file:

1)Number (count) of x-y pairs stored in the input file

2)Average x-value and average y-value

3)Standard deviation of x-values and standard deviation of y-values

4)Correlation coefficient of x-values and y-values

5)Slope (m) and intercept (b) in the best fitting line, y = mx + b, of x-values and y-values.
