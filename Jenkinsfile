pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "sbt compile"
            }
        }
    }
}