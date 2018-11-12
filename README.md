# Gradle for Android and Java Final Project

In this project, I created an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app consist
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

## Why this Project

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

 The role of Gradle in building Android Apps and how to use
Gradle to manage apps of increasing complexity.

* Added free and paid flavors to an app, and set up build to share code between them
* Factored reusable functionality into a Java library
* Factored reusable Android functionality into an Android library
* Configured a multi project build to compile libraries and app
* Used the Gradle App Engine plugin to deploy a backend
* Configured an integration test suite that runs against the local App Engine development server

## Completed this Project in the following steps:

### Step 0: Starting Point

This is the starting point for the final project, which is provided in
the [course repository](https://github.com/udacity/ud867/tree/master/FinalProject). It
contains an activity with a banner ad and a button that purports to tell a
joke, but actually just complains. The banner ad was set up.


### Step 1: Created a Java library

The first task was to create a Java library that provides jokes. Created a new
Gradle Java project either using the Android Studio wizard, or by hand. Then
introduced a project dependency between the app and the new Java Library.

Made the button displayed a toast showing a joke retrieved from the Java joke
telling library.

### Step 2: Created an Android Library

Created an Android Library containing an Activity that displays a joke
passed to it as an intent extra. Wired up project dependencies so that the
button can now pass the joke from the Java Library to the Android Library.


### Step 3: Setup GCE

This next task was pretty tricky. Instead of pulling jokes directly from
our Java library, I set up a Google Cloud Endpoints development server,
and pulled jokes from there.

Introduced a project dependency between Java library 
and GCE module, and modified the GCE starter code to pull jokes from Java library. 
Created an AsyncTask to retrieve jokes.


### Step 4: Added Functional Tests

Added code to test that the Async task successfully retrieves a non-empty
string. For a refresher on setting up Android tests.

### Step 5: Added a Paid Flavor

Added free and paid product flavors to the app. Removed the ad (dependencies) from the paid flavor.

### Configured Test Task

To tie it all together, created a Gradle task that:

1. Launches the GCE local development server
2. Runs all tests
3. Shuts the server down again

