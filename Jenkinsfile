pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "sbt compile"
            }
        }
        stage('ScalaTest') {
                    steps {
                        echo "Compiling..."
                        sh "sbt test"
                    }
                }
    }
}