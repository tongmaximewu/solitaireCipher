# solitaireCipher
Introduction
Welcome to the Solitaire Cipher project! In this project, we'll delve into the world of cryptography by implementing the Solitaire encryption algorithm. Inspired by Neal Stephenson’s 'Cryptonomicon' and Bruce Schneier’s Solitaire algorithm, we embark on a journey to create a secure means of communication using playing cards and cryptographic chaos.

# Background
The Solitaire Cipher, also known as the Pontifex Cipher, is a stream cipher that utilizes a deck of playing cards to generate a pseudorandom keystream. This keystream is then used to encode and decode messages, ensuring secure communication between parties.

# Project Overview
Learning Objectives
* Gain exposure to simple cryptography concepts.
* Implement a stream cipher using the Solitaire algorithm.
* Work with linked lists to represent a deck of cards.
* Emphasize algorithm efficiency and performance.
* Practice Java programming skills.

# Implementation
The project consists of two main classes:

* Deck: Represents a deck of cards and includes methods for initialization, shuffling, and card manipulation. Key methods include:

Deck(int numOfCardsPerSuit, int numOfSuits): Initializes a deck with specified parameters.
Deck(Deck d): Creates a deep copy of a given deck.
shuffle(): Shuffles the deck using the Fisher–Yates shuffle algorithm.
Other methods for card manipulation and generation of keystream values.
* SolitaireCipher: Implements the Solitaire algorithm to generate keystreams and encode/decode messages using the generated keystreams.

# Instructions
* Implement methods within the Deck class as specified in the provided instructions.
* Ensure efficiency in implementations, adhering to given runtime complexities.
* Test the Solitaire Cipher by encoding and decoding messages.
# Usage
* Clone the repository.
* Compile and run the SolitaireCipher.java file.
* Follow instructions to encode and decode messages using the Solitaire Cipher.

# Example
Consider the following example:

* Generate a deck of 12 cards.
* Shuffle the deck.
* Use the shuffled deck to create a Solitaire cipher.
* Encode the message "Is that you, Bob?" using the generated keystream.
* Decode the ciphertext to retrieve the original message.
# Conclusion
Join us in the exciting world of cryptography as we explore the Solitaire Cipher! Secure your communication channels and embrace the power of encryption. Happy coding!
