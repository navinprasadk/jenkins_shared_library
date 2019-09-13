def call(){
            
         withSonarQubeEnv(credentialsId: 'sonar_anu', installationName: 'Sonar') {
    // some block
                     
}
      def qualitygate = waitForQualityGate()
      if (qualitygate.status != "OK") {
         error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
      }
}

    
