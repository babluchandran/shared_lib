def call(String imageName) {
    app = docker.build("techmid/${imageName}")
       
  }
