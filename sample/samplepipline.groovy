@Library("asi-jenkins@main")

pipeline {
    agent any
    stages {
        stage ("example"){
            steps {
                callHelloWorld();
            }
        }
    }
}