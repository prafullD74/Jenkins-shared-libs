def call(String Project, String ImageTag, String dockerhubuser){
    withCredentials([usernamePassword(credentialsId:'DockerHubCred', passwordVariable: 'dockerHubPass', usernameVaribale: 'dockerHubUser')]) {
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
