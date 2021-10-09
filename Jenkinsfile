pipeline {
  agent { label 'linux' }
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  environment {
    DOCKERHUB_CREDENTIALS = credentials('ejn-dockerhub')
  }
  stages {
    stage('Build') {
      steps {
        sh 'docker build -t ejnephew/pipeline-project:latest .'
      }
    }
    stage('Login') {
      steps {
        sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      }
    }
    stage('Push') {
      steps {
        sh 'docker push ejnephew/pipeline-project:latest'
      }
    }
  }
  post {
    always {
      sh 'docker logout'
    }
  }
}