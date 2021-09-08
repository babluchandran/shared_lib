def call(String imageName) {
    sh "docker build -t techmid/${imageName}"        
  }
