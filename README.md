## Android First Time Library

Android First Time Library is a really small library that helps you when you have to execute one method only the first time that the user open your Android app (Tutorials, Licenses, Warnings ... )




## Installation

To use the library, first include it your project using Gradle

	repositories {
	    // ...
	    maven { url "https://jitpack.io" }
	}

	dependencies {
	        compile 'com.github.Angtrim:Android-First-Time-Library:1.0'
	}



## How to use

Annotate the method you want to be executed only once



    @FirstTimeOnly
    public void myOnlyOnceMethod(){

        Toast.makeText(this,"Only Once",Toast.LENGTH_LONG).show();

    }


Then add this in your Activity where you want the method to be called.



    FirstTimer.invoke(this);

## How it works

The library is very simple.
It just saves a boolean in the SHARED PREFERENCES to check if it's the first time.


## License

Do what you want with this library.