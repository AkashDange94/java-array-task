pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This pulls the code from your GitHub repository
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                sh 'javac ArrayProcessor.java'
            }
        }

        stage('Run & Test') {
            steps {
                echo 'Executing the program...'
                sh 'java ArrayProcessor'
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
