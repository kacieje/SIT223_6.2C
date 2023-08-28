pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Build automation through Maven"
            }        
        }
        
        stage('Unit and Integration Tests') {
            steps {
                echo "Unit and Integration testing through Cypress"
            }
            post {
                success {
                    emailext attachLog: true,
                    to: "kjeaton@deakin.edu.au",
                    subject: "SIT223_6.2C Test Status Email",
                    body: "Integration and Unit testing was successful"
                }
                failure {
                    emailext attachLog: true,
                    to: "kjeaton@deakin.edu.au",
                    subject: "SIT223_6.2C Test Status Email",
                    body: "Integration and Unit testing failed"
                }
            }
        }
        
        stage('Code Analysis') {
            steps {
                echo "Code analysis through PMD"
            }
        }
       
        stage('Security Scan') {
            steps {
                echo "Perform security scan through Snyk Security"
            }
            post {
                success {
                    emailext attachLog: true,
                    to: "kjeaton@deakin.edu.au",
                    subject: "SIT223_6.2C Security Scan Status Email",
                    body: "Security Scan was successful"
                }
                failure {
                    emailext attachLog: true,
                    to: "kjeaton@deakin.edu.au",
                    subject: "SIT223_6.2C Security Scan Status Email",
                    body: "Security Scan failed"
                }
            }
        }

        stage('Deploy to Staging') {
            steps {
                echo "Deploy to AWS EC2 Staging"
            }
        }
          
        stage('Integration Tests on Staging') {
            steps {
                echo "Run staging integration tests"
            }
        }
        
        stage('Deploy to Production') {
            steps {
                echo "Deploy to AWS EC2 Production"
            }
        }
    }
}
