pipeline {
  agent any
  tools{
    maven 'Maven';
    jdk 'JDK';
  }
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }

  }
}