pipeline{
  stages{
    stage('Build'){
      echo "Build"
    }
    parallel{
          stage('UT'){
            echo "UT"        
            }
          stage('Final Testing'){
              echo "Final"
          }

    }
    stage('Deply'){
      echo "Deploy"
    }
  }
}
