import ApiUtils from '../Utils/ApiUtils.js'

const endPoints = {

  //lakes
  CREATE_NAME: '/createName',

}

export default class Service {

  static createName() {
    // const params = JSON.stringify();
    const urlPath = endPoints.CREATE_NAME
    return ApiUtils.doPost(urlPath, {}, true)
  }
}
