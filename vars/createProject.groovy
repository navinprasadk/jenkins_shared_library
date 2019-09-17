def call(){
httpRequest authentication: 'bitbucket-new', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: '''{
    "key": "BIK",
    "name": "BIKER"
}''', responseHandle: 'NONE', url: 'http://18.224.68.30:7990/rest/api/1.0/projects'
}
