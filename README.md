## Android First Time Library

Android First Time Library is a really small library that helps you when you have to execute one method only the first time that the user open your Android app (Tutorials, Licenses, Warnings ... )




## Installation

To use the library, first include it your project using Gradle


    allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
    }

	dependencies {
	        compile 'com.github.Angtrim:Android-Five-Stars-Library:v1.0'
	}



## How to use

Annotate the method you want to be executed only once



    @FirstTimeOnly
    public void myOnlyOnceMethod(){

        Toast.makeText(this,"Only Once",Toast.LENGTH_LONG).show();

    }


Then add this in your Activity where you want the method to be called.



    FirstTimer.invoke(this);


Or do :

       public void myOnlyOnceMethod(){

           if(FirstTimer.isFirstTime(this)){

               Toast.makeText(this,"Only Once",Toast.LENGTH_LONG).show();

           }
       }

## How it works

The library is very simple.
It just saves a boolean in the SHARED PREFERENCES to check if it's the first time.

## Used by

If you use my library, please tell me at angelo.gallarello [at] gmail [dot] com.
So I can add your app here!


## License

Do what you want with this library.