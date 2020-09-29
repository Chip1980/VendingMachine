# Coding Dojo - VendingMachine


## Task
    Develop the core business logic for a drink vending machine. The machine has several compartments for
    different drinks, each with its own price.

## Details
    The vending machine only accepts the following coins:
    
    10, 20 and 50 cents; 1 and 2 Euro pieces (respectively 100 and 200 cents) Say a customer buys a
    drink with a price of 1.20 Euro; she inserts a single 2 Euro coin and expects 80 cents change. The
    vending machine could provide the change in the form of 1 x 50 cent, 1 x 20 cent and 1 x 10 cent
    pieces. Each compartment can only hold a certain number of drinks. The machine has a coin changer
    which holds change, releases coins when change is given out, and re-stocks itself with incoming coins
    that are inserted.

## Guidance
    The main logic – that of a customer purchasing a drink – should be provided through a meaningfully named
    and typed interface. It might look as follows:
    
        - DrinkAndChange buy( DrinkChoice, choice, Coin… input );
    
    This function returns either:
    
        - The chosen drink and, if necessary, any change in coins, or
        - An exception (e.g. the requested drink is sold out; not enough money given; not enough change available).

    Apart from the main function, your interface should also allow the machine to be restocked with drinks and
    coins, or emptied of both. Include only as much flexibility in your implementation as is needed to satisfy the
    above specification. You do not need to provide any kind of graphical user interface, nor any ability to
    persist the vending machine’s state. An in-memory solution is completely sufficient. Show that your solution
    works as intended by providing automated tests.

## Goal
    We want you to create an elegant and easy-to-understand implementation that, as far as possible, uses
    terms which are intelligible to humans. In general, use object-oriented plain Java in your solution. You may
    employ some Java features and standard Java API, but keep them to a minimum. We prefer working code
    to completeness of solution. A partial solution is okay, as long as the automated tests prove it works, and
    the code is self-contained.

## Deliverables
    - Source code and tests
    - A brief README detailing how to run the program and execute tests
