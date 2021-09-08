def call(String imageName) {
      sh "docker push techmid/${imageName}:${env.BUILD_NUMBER}" 
  }
