/**
 * Created by ginollerena on 7/29/18.
 */

//const API_PATH = '/api/'

function getHeaders(jsonFormat) {

  const token = ''

  const headers = {
    // 'Access-Control-Allow-Origin': '*',
    // 'X-Requested-With': 'XMLHttpRequest',
    // 'Content-Type': jsonFormat ? 'application/json' : 'application/x-www-form-urlencoded'
  }

  return {
    // headers: (!!token ? {...headers, 'authorization': 'Bearer ' + token} : headers),
    // credentials: 'same-origin' //'include'  //
  }
}

export default class ApiUtils {

  static getServer(url) {
    const { location } = window
    // API_PATH +
    return location.protocol + '//' + location.host + url
  }

  static handleResponse(response) {
    return response.json()
      .then(data => {
        if (!response.ok) {
          if (response.status === 401) {
            // auto logout if 401 response returned from api
            //ApiUtils.logout();
          }
          const error = (response && response.errors) || (data && data.message) || response.statusText
          return Promise.reject(error, response.status)
        }
        return data
      })
  }

  static doPost(url, body = {}, jsonFormat = false) {

    const requestOptions = {
      method: 'POST',
      ...getHeaders(jsonFormat),
      body: body
    }
    return fetch(this.getServer(url), requestOptions).then(ApiUtils.handleResponse)
  }
}
