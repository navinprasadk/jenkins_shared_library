def call(){
            
         withSonarQubeEnv(credentialsId: 'sonar_anu', installationName: 'Sonar') {
    // some block
                     waitForQualityGate abortPipeline: false, credentialsId: 'sonar_anu'
}
}

    
