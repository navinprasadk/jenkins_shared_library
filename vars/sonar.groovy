def call(){
            withSonarQubeEnv('Sonar') {
              sh 'cd client;${scannerHome}/bin/sonar-scanner -Dproject.settings=./Sonar.properties;'
                  }
}

    