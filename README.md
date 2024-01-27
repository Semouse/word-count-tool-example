# word-count-tool-example
This challenge is to build your own version of the Unix command line tool wc!

Source: https://codingchallenges.fyi/challenges/challenge-wc

# To build: 
mvn clean install
# To run: 
java -jar ./target/ccwc.jar _Flag_ _Filepath_

# Flag Description:
**"-c"** - return number of bytes  
**"-l"** - return number of lines  
**"-w"** - return number of words  
**"-m"** - return number of characters

By default **"-c" "-l" "-w"** flags are applied.

