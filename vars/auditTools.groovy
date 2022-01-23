def call() {
  node {
     sh '''
    git version
    node --version
    npm version
    '''
  }
}