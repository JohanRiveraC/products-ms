pipeline {
    agent any

    tools {
        gradle "6.9.1" // You need to add a maven with name "3.6.3" in the Global Tools Configuration page
    }

    stages {
        stage("Gradle Build") {
            steps {
                sh "gradle -v"
                sh "./gradlew build"
            }
        }

        stage("CP War --> Tomcat") {
            steps {
                sh "cp ./build/libs/products-ms-0.0.1-SNAPSHOT.war /home/fbaron/opt/tims/tomcat/dev/webapps/products.war"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}