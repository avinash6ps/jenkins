pipeline {
  agent any
  stages {
    stage('Pre build') {
      parallel {
        stage('Pre build') {
          steps {
            echo 'Pre build'
          }
        }

        stage('Check pre build') {
          steps {
            echo 'Build about to start'
            timeout(time: 10) {
              sh '''# !/bin/bash

echo "HI"'''
            }

          }
        }

      }
    }

    stage('Test') {
      steps {
        sleep 5
        echo 'Testing started'
      }
    }

    stage('pre test') {
      parallel {
        stage('pre test') {
          steps {
            echo 'Pre test'
          }
        }

        stage('phy device') {
          steps {
            echo 'checkin oin phy device'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'dployed'
      }
    }

    stage('End') {
      steps {
        echo 'Completed'
      }
    }

  }
}