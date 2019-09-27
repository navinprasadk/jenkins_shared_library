def call(){
httpRequest authentication: 'bitbucket_anu', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: '''
{
"name": "tomcat_web_app",
"scmId": "git",
"forkable": true
}''', responseHandle: 'NONE', url: 'http://18.224.68.30:7990/rest/api/1.0/projects/ANK/repos'
}
