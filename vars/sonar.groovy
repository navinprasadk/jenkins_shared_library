def call(){
            
 environment {
           scannerHome=tool 'sonar scanner'
       }
            steps {
                
                sh "mvn sonar:sonar -Dsonar.host.url=http://18.224.155.110:9000"
            }
}

    
