const serverUrl = 'http://localhost:8080'

// with apostrophe - JAVA way
const allTripsUrlJavaWay: string = serverUrl +  '/api/trips'

// with backticks to use ${...}
export const allTripsUrl: string = `${serverUrl}/api/trips`
