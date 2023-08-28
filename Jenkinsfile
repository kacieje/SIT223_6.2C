pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Build code using a build automation tool to compile and package code"
            }        
        }
        
        stage('Unit and Integration Tests') {
            steps {
                echo "Run unit tests to ensure code functions as expected and run"
                echo "integration tests to ensure the different components work as expected"
                echo "specify the test automation tools"
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
                echo "integrate code analysis tool to analyse the code to meet industry standards"
                echo "Research and select a tool to analyse your code using Jenkins"
            }
        }
       
        stage('Security Scan') {
            steps {
                echo "perform security scan on the code using tool to identify vulnerabilities"
                echo "research and select a tool to scan your code"
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
        
        stage('Integration Tests on Staging') {
            steps {
                echo "run integration tests on the staging environment to"
                echo "ensure application functions as expected in a production-like environment"
            }
        }
        
        stage('Deploy to Production') {
            steps {
                echo "Deploy the code to a production server i.e. AWS EC2 instance"
            }
        }
    }
}
//edit for poll
