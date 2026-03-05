pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code on Windows...'
                // Use 'bat' instead of 'sh' for Windows
                bat 'javac ArrayProcessor.java'
            }
        }

        stage('Run & Test') {
            steps {
                echo 'Executing the program...'
                // Use 'bat' instead of 'sh' for Windows
                bat 'java ArrayProcessor'
            }
        }
    }
    
    post {
        success {
            echo 'Array processing completed successfully!'
        }
        failure {
            echo 'Something went wrong with the build.'
        }
    }
}