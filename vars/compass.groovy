def callHelloWorld() {
    bat 'echo hello world'
}

// def postJsonToWebhook(compassWebhookUrl, jsonString) {
//     def jsonString =  groovy.json.JsonOutput.toJson(jsonObject)

//     println(jsonString)
//     try {
//         def response = httpRequest(
//             httpMode: 'POST',
//             contentType: 'APPLICATION_JSON',
//             requestBody: jsonString,
//             url: compassWebhookUrl
//         )
//         println("Response: ${response}")
//     } catch (Exception e) {
//         println("Failed to send JSON to webhook: ${e.message}")
//         throw e;
//     }
// }

// def generateCompassBuildState(repoName, startDate, compassWebhookUrl, buildState) {
//     def jsonObject = [
//         state: buildState,
//         url: env.BUILD_URL,
//         pipelineId: "${repoName}_${env.BRANCH_NAME}_${env.BUILD_ID}",
//         version: env.BUILD_NUMBER,
//         description: env.JOB_NAME,
//         branchName: env.BRANCH_NAME,
//         startedAt: currentTime,
//         completedAt: null,
//         repoName: repoName
//     ]

//     def jsonString =  groovy.json.JsonOutput.toJson(jsonObject)
//     postJsonToWebhook(jsonString)
// }