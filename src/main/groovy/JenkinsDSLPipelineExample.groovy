pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo 'The pipeline init'
                echo 'Testing'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the Maven Project'
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying in Staging Area"
            }
        }
        stage('Deploy Production') {
            steps {
                echo "Deploying in Production Area"
            }
        }
    }
}
