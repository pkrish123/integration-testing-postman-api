pipeline {
  agent any
  tools{
    maven 'Maven';
    jdk 'JDK';
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}