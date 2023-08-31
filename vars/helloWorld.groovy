def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def messagingWin( String mess ) {
    cmd "echo ${mess}"
}

def messagingLnx( String mess ) {
    sh "echo ${mess}"
}
