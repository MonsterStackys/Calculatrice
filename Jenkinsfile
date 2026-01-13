pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Compilation du projet Calculatrice...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests unitaires...'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Déploiement (simulation)...'
                sh 'echo Application Calculatrice déployée'
            }
        }
    }

    post {
        success {
            echo 'Pipeline Jenkins exécuté avec succès '
        }
        failure {
            echo 'Échec du pipeline '
        }
    }
}
