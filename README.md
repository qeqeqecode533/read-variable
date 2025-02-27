# readVar - Simple Java Input Validation Library

`readVar` is a lightweight Java library designed to simplify reading and validating user input from the console. It provides static methods to read various data types (`int`, `String`, `double`, `float`, `boolean`) with customizable prompts, reprompts, and range constraints. This library is ideal for console-based applications where robust input handling is needed without built-in detailed error messaging—users are expected to define their own feedback through reprompts.

## Features
- **Single Scanner**: Uses one `Scanner` instance for `System.in` to ensure reliable input handling.
- **Flexible Overloads**: Multiple method variants allow control over minimum/maximum values and prompts.
- **Minimal Feedback**: Reprompts are user-configurable, keeping the library lightweight and adaptable.
- **Data Types Supported**: Handles integers, strings, doubles, floats, and booleans with validation.

## Installation
1. Download the `readVar.java` file from this repository.
2. Place it in your Java project directory.
3. Compile it alongside your program or import it:
   ```java
   import static readVar.*;
   ```
   (Note: If placed in a package, adjust the import statement accordingly.)

## Usage
The library provides static methods for reading input. Each method requires a `prompt` (initial message) and a `reprompt` (message shown after invalid input). Users must configure reprompts to provide context-specific feedback.

### Methods
Below are the primary methods and their overloads. All methods loop until valid input is received.

#### `readInt`
Reads an integer within a specified range.
- **Signature**: `int readInt(int min, int max, String prompt, String reprompt)`
- **Overloads**:
  - `readInt(int min, int max, String prompt)` - Same prompt and reprompt.
  - `readInt(int min, int max)` - No prompt/reprompt.
  - `readInt(int min)` - Minimum value, max is `Integer.MAX_VALUE`.
  - `readInt(int min, String prompt)` - Minimum with prompt.
  - `readInt(int min, String prompt, String reprompt)` - Minimum with custom prompts.
  - `readInt(String prompt, String reprompt)` - Full integer range.
  - `readInt(String prompt)` - Full range, same prompt/reprompt.

#### `readLine`
Reads a non-empty string.
- **Signature**: `String readLine(String prompt, String reprompt)`
- **Overloads**:
  - `readLine(String prompt)` - Same prompt/reprompt.
  - `readLine()` - No prompt/reprompt.

#### `readDouble`
Reads a double within a specified range.
- **Signature**: `double readDouble(double min, double max, String prompt, String reprompt)`
- **Overloads**: Similar to `readInt`, with `Double.MAX_VALUE` and `-Double.MAX_VALUE` defaults.

#### `readFloat`
Reads a float within a specified range.
- **Signature**: `float readFloat(float min, float max, String prompt, String reprompt)`
- **Overloads**: Similar to `readInt`, with `Float.MAX_VALUE` and `-Float.MAX_VALUE` defaults.

#### `readBool`
Reads a boolean (`true` or `false`, case-insensitive).
- **Signature**: `boolean readBool(String prompt, String reprompt)`
- **Overloads**:
  - `readBool(String prompt)` - Same prompt/reprompt.
  - `readBool()` - No prompt/reprompt.

#### `close`
Closes the internal `Scanner`.
- **Signature**: `void close()`
- **Warning**: This closes `System.in`, preventing further console input in your program. Use only when no more input is needed.

## Examples

### Reading an Integer with Range
```java
import static readVar.*;

public class Main {
    public static void main(String[] args) {
        int age = readInt(1, 100, "Enter your age (1-100): ", "Invalid input, enter a number between 1 and 100: ");
        System.out.println("Your age is: " + age);
    }
}
```
- **Behavior**: Prompts for an age between 1 and 100. If the user enters a non-integer, empty string, or number outside the range, it displays the custom reprompt.

### Reading a String
```java
String name = readLine("What's your name? ", "Name cannot be empty, try again: ");
System.out.println("Hello, " + name + "!");
```
- **Behavior**: Ensures a non-empty name is entered, using the reprompt for empty inputs.

### Reading a Boolean
```java
boolean likesCoffee = readBool("Do you like coffee? (true/false): ", "Please enter 'true' or 'false': ");
System.out.println("Likes coffee: " + likesCoffee);
```
- **Behavior**: Accepts only "true" or "false" (case-insensitive), reprompting otherwise.

## Notes
- **Reprompt Customization**: The library does not provide detailed error messages (e.g., "Not a number" or "Out of range"). Users must include specific instructions in the `reprompt` parameter to guide the user (e.g., "Enter a number between 0 and 10: ").
- **Input Validation**: Methods reject empty strings and invalid formats, looping until valid input is provided.
- **Closing the Scanner**: Use `close()` cautiously, as it shuts down `System.in` for the entire program.

## Contributing
Feel free to fork this repository, submit pull requests, or open issues for suggestions or bug reports.

## License
This project is unlicensed and free to use for educational or personal purposes. No warranty is provided—use at your own risk!
