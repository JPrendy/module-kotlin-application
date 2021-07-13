# Module Kotlin Application

## Description

A Kotlin Application that contains an Android module/library that is structurally the same as an Android app module, but can be reused in many other projects. 

## Contents

- [Setup Steps](#setup-steps)
- [How to run the project locally](#how-to-run-the-project-locally)
- [Tools](#tools)
- [Update Dependencies](#update-dependencies)
- [Releases](#releases)
- [Helpful resources](#helpful-resources)

## Setup Steps

For this application, you will want to create a `New Module` and pick Android Library. This module will be used in our Main application.

The main application is a `Phone and Tablet module` and a `green dot` folder icon and we can run this independently on a device, while the new module we created `module-text-example` is an `Android library` has a `three books` folder icon and we cannot run this independently on a device as it does not has any layout files. So anything we create in `module-text-example` has to imported into the main app. This makes it easier for future projects where we can import modules/libraries without needing to write them from scratch and makes the code easier to manage.

**Important:** we cannot import another app in another app aka `Phone and Tablet module` `green dot` folder icon calling a `Phone and Tablet module` `green dot` folder icon.

Go to `settings.gradle` and add the following 

```kotlin
include ':module-text-example'
include ':app'
rootProject.name = "module-kotlin-application"
```

Go to the app's `build.gradle` and add the following 


```kotlin
implementation project(':module-text-example')
```

After, you have made a release, go to [https://jitpack.io/#JPrendy/module-kotlin-application/v1.0](https://jitpack.io/#JPrendy/module-kotlin-application/v1.0) and follow the steps.
Now we can add this module to any further projects using Jitpack.io

In the new project, where you want to add this repo's module, you will need to do the following

Add it in your root `build.gradle` at the end of repositories:

```kotlin
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency to the app's `build.gradle`

```kotlin
dependencies {
        implementation 'com.github.JPrendy:module-kotlin-application:Tag'
}
```

Note, we cannot run ui tests in the `module-text-example` module, only in the app itself because we have no activity to reference in the module.

## How to run the project locally

To run the unit tests locally.

```
./gradlew testdebugUnitTest
```

To run the ui tests locally, but first we need an emulator to be open.

```
./gradlew connectedCheck
```

## Tools

**Linter:** we use the following linter [link](https://github.com/github/super-linter).

**Uploading Artifacts:**  we use the following way to upload Artifacts, they allow you to persist data like test results after a job has completed, see the following documentation [link](https://docs.github.com/en/actions/configuring-and-managing-workflows/persisting-workflow-data-using-artifacts).

**Creating images/icons:** we use Figma to create images and icon. Figma makes it very easy to create designs in many different formats.

**Creating a Mock Server:** we use a mock server with Postman to quickly test apis, to see how to create a mock server, see the following video [link](https://www.youtube.com/watch?v=rJY8uUH2TIk). 

### Mobile Specific Tools:
 
**Fastlane:** Fastlane allows us to automate our development and release process [link](https://docs.fastlane.tools/).

**App Center:** App Center is used to distribute an app, making it very easy to test on a physical device by using a fastlane plugin [link](https://github.com/microsoft/fastlane-plugin-appcenter).

## Update Dependencies

**Npm:** How to update a npm package.
- [link](https://docs.npmjs.com/cli/update).

**Gemfile:** How to update a Gemfile package.
- [link](https://bundler.io/man/bundle-update.1.html#UPDATING-A-LIST-OF-GEMS).

## Releases

How to manage releases in a repository [link](https://help.github.com/en/github/administering-a-repository/managing-releases-in-a-repository). 

## Helpful resources

The following link provides helpful information on how you can create your own android library
- [link](https://www.raywenderlich.com/52-building-an-android-library-tutorial).

The following link provides helpful information on how you can publish your android library to Jitpack.io
- [link](https://medium.com/@anujguptawork/how-to-create-your-own-android-library-and-publish-it-750e0f7481bf).