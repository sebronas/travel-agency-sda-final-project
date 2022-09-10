const serverUrl = 'http://localhost:8080'

// with apostrophe - JAVA way
// const allTripsUrlJavaWay: string = serverUrl + '/api/trips'

// with backticks to use ${...}
export const allTripsUrl: string = `${serverUrl}/api/trips`

// internal links
export const homeUrl = 'home'
export const defaultUrl = ''
export const tripsUrl = 'all-trips'
export const aboutUsUrl = 'about-us'
export const notFoundUrl = '**'
