pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "/usr/local/bin/sbt compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
                sh "/usr/local/bin/sbt test"
            }
        }

    }
}