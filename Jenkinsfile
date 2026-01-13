pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'MAVEN'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compilation du projet Calculatrice...'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests...'
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Packaging de l’application...'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline exécuté avec succès '
        }
        failure {
            echo 'Échec du pipeline '
        }
    }
}
