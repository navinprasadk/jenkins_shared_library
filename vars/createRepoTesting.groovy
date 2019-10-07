import groovy.json.JsonSlurper 

@NonCPS
createRepo(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
String repoName2 = resultJson.repoName
def projUrl = resultJson.url
  
  println '"'+repoName2.toString()+'"'
  String repoName='"'+repoName2.toString()+'"'
  httpRequest authentication: 'bitbucket_anu', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: '''
{
    "name": '"'+repoName+'"',
    "scmId": "git",
    "forkable": true
}''', responseHandle: 'NONE', url: projUrl +'DEM/repos' 
}


def call(){
 def request = libraryResource 'data.json'
 createRepo(request)
}





/*def call(){
httpRequest authentication: 'bitbucket_anu', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: '''
{
"name": "web_1",
"scmId": "git",
"forkable": true
}''', responseHandle: 'NONE', url: 'http://18.224.68.30:7990/rest/api/1.0/projects/DEM/repos'
}*/
