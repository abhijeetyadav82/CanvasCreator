# Drawing-on-console
A simple console version of a drawing program.
# Architecture
The program is built on Java8.
# Command Description
Command 	    |	Description
--------------|---------------
C w h         |  Create a new canvas of width w and height h.
L x1 y1 x2 y2 |  Should create a new line of 'x' from (x1,y1) to (x2,y2). Currently only horizontal or vertical lines are supported. Horizontal and vertical lines will be drawn using the 'x' character.                 
R x1 y1 x2 y2 |  Should create a new rectangle, (x1,y1) is upper left corner & (x2,y2) is lower right corner.
B x y c       |  Fill the entire area around (x,y) with "colour" c. Same as that of the "bucket fill" tool in paint programs. 
Q             |  Quit.
# Commands to run
- To run the program
  - `javac Canvas.java`
  - `java Canvas`
- To run the test
  - `javac TestCanvas.java`
  - `java TestCanvas`
