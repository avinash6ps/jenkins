pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
          echo "Build"
      }
      
    }
    stage('Testing'){
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
    }
    stage('Deply'){
      steps{
        echo "Deploy"
      }
      
    }
  }
}


