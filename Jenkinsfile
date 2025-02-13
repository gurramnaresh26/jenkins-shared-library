@Library('mySharedLibrary') _
pipeline {
    agent any
    stages {
        stage('Test Shared Library') {
            steps {
                exampleFunction('Jenkins User')  // Calling shared function
            }
        }
    }
}
