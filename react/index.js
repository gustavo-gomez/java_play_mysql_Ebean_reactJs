import React from 'react'
import ReactDOM from 'react-dom'
import pagConst from './images/const1.png'
import Service from './services/services'

const App = () => {

  const createName = () => {
    Service.createName().then(data => {
      console.log('response: ', data)
    })
  }

  return (
    <div className="page_container" onClick={() => createName()}>
      <img src={pagConst} className="image_const"/>
    </div>
  )
}
ReactDOM.render(<App/>, document.getElementById('app'))
