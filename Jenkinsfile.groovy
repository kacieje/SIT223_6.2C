pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Build code using a build automation tool to compile and package code"
            }        
            post{
                success{
                    mail to: "kjeaton@deakin.edu.au"
                    subject: "SIT223_6.2C Build Status Email"
                    body: "Build was successful"
                }
        }
        }
        
        stage('Unit and Integration Tests') {
            steps {
                echo "Run unit tests to ensure code functions as expected and run 
                integration tests to ensure the different components work as expected"
                echo "specify the test automation tools"
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
        }
        
        stage('Integration Tests on Staging') {
            steps {
                echo "run integration tests on the staging environment to 
                ensure application functions as expected in a production-like environment"
            }
        }
        
        stage('Deploy to Production') {
            steps {
                echo "Deploy the code to a production server i.e. AWS EC2 instance"
            }
        }

    }
}