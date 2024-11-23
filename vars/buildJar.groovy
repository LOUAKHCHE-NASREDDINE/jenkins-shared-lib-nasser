#!/user/bin/env groovy

def call() {
    
    echo 'Building the Jar file...'
    sh 'mvn clean package'

}