def call(String imageName) {
    sh "docker build -t techmid/${imageName}:${env.BUILD_NUMBER}"        
  }
