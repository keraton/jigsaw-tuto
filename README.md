# Java Modularity

## Why module ?

* Export only what you want
    * Hide the implementation detail 
* Java module, public in the same module
    * Compilation and runtime 
    * Reflection
* Better encapsulation     

## Module structure

Using java convention src/{your module name }/{your module}
Example :

    src/com.greetings/com/greeting/Main.java
    
For the sake of simplicity we are going to use IntelliJ structure.    
 
    com.greetings/src/com/greeting/Main.java
    

## The application

```
// Greeting apps

    GREETING APP -> Greeting Service        -> Greeting Bean
                 -> Greeting Reflection                     

```

## Create monolith module

Define your module with module-info.java.
* Module name
* Module requirements


Create the greeting app module which only print Hello World.
This is a monolith application which contains all the necessary code.

## Separate App and Service


Define your module with module-info.java.
* Module exports

## Use Bean and Repo instead of String

Define your module with module-info.java.
* Module requires transitive and non transitive



## Use export to a friend instead of export all

Export Greeting Repo only to the Greeting Service.

Define your module with module-info.java.
* Module export friends

## Use Greeting Reflection

Get internal value of Greeting Bean by using deep reflection.

Define your module with module-info.java.
* Open module or opens packages

## Plugin Architecture

```
// Greeting apps

    GREETING APP -> Greeting Service Interface  -> Greeting Service Impl 1
                                                -> Greeting Service Impl 2 (optional)
                 

``` 

## Define the Service Interface

Define your module with module-info.java.
* Declare interface with use
* Provide implementation
* Use implementation


## Automatic module and unnamed module

TBD












