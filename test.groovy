pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
          echo "Build"
      }
      
    }
    parallel{
          stage('UT'){
            steps{
                echo "UT"   
            }
                 
            }
          stage('Final Testing'){
            steps{
              echo "Final"
            }
              
          }

    }
    stage('Deply'){
      stepls{
        echo "Deploy"
      }
      
    }
  }
}
