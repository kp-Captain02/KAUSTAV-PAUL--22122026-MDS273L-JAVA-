Question:-
Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row

Plain

A

B

C

D

E

F

G

H

I

J

K

L

M

N

O

P

Q

R

S

T

U

V

W

X

Y

Z

Cypher

X

Y

Z

A

B

C

D

E

F

G

H

I

J

K

L

M

N

O

P

Q

R

S

T

U

V

W

Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.



Draw a flow chart for your program and write the pseudocode before starting the coding in your observation notebook.

Explanation:-

There are three menu option in the program 1)To encrypt 2)To decrypt 3)To Exit

In this implementation, the encrypt function accepts a string message and returns the encrypted message by replacing each letter in the message with the corresponding letter in the cipher row. The decrypt function accepts a string message and returns the decrypted message by replacing each letter in the message with the corresponding letter in the plain row.

The program prompts the user to choose an option (encrypt, decrypt, or exit) and then accepts the message to be encrypted or decrypted. The program then calls the corresponding function and prints the result.


Flowchart:-
    
     +-----------------------------------+
                   |    Start the Program               |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Initialize variables              |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Print menu to choose an option     |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Get the user's choice              |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Use switch case to handle choice   |
                   +-----------------------------------+
                                 |
                                 v
          +------------------+------------+------------------+
          |   Choice = 1     |  Choice = 2|   Choice = 3     |
          +------------------+------------+------------------+
                                 |            |
                                 v            v
                   +-----------------------------------+
                   |  Ask for message and encrypt it    |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Ask for message and decrypt it    |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |  Exit the program                   |
                   +-----------------------------------+
                                 |
                                 v
                   +-----------------------------------+
                   |   End the Program                   |
                   +-----------------------------------+