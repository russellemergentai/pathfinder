pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "C:\\Program Files (x86)\\sbt\\bin\\sbt compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
                sh "C:\\Program Files (x86)\\sbt\\bin\\sbt test"
            }
        }

    }
}