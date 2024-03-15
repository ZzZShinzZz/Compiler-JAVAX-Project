# Demo test file for if, for, while statements in Python

# Example of an if statement
def test_if(x):
    if x > 0:
        print("x is positive")
    elif x == 0:
        print("x is zero")
    else:
        print("x is negative")

# Example of a for loop
def test_for():
    print("Counting from 1 to 5:")
    for i in range(1, 6):
        print(i)

# Example of a while loop
def test_while():
    n = 5
    print("Countdown from 5:")
    while n > 0:
        print(n)
        n -= 1

# Testing the functions
if __name__ == "__main__":
    test_if(3)
    test_if(0)
    test_if(-5)

    test_for()

    test_while()
