import React from 'react'
import ReactDOM from 'react-dom'
import react from './images/react.png'
import java from './images/java.png'
import mysql from './images/mysql.png'
import play from './images/play.png'
import webpack from './images/webpack.png'
import ebean from './images/ebean.png'
import Service from './services/services'

const App = () => {

  const createName = () => {
    Service.createName().then(data => {
      console.log('response: ', data)
    })
  }

  return (
    <div className="App">
      <div className="row">
        <a href="https://www.playframework.com/documentation/2.8.x/Home" target="_blank"><img src={play} className="App-logo" alt="logo"/></a>
        <a href="https://docs.oracle.com/en/java/" target="_blank"><img src={java} className="App-logo" alt="logo"/></a>
      </div>
      <div className="row">
        <a href="https://reactjs.org/" target="_blank"><img src={react} className="App-logo" alt="logo"/></a>
        <a href="https://webpack.js.org/" target="_blank"><img src={webpack} className="App-logo" alt="logo"/></a>
      </div>
      <div className="row">
        <a href="https://www.playframework.com/documentation/2.8.x/AccessingAnSQLDatabase" target="_blank"><img src={mysql} className="App-logo" alt="logo"/></a>
        <a href="https://ebean.io/" target="_blank"><img src={ebean} className="App-logo" alt="logo"/></a>
      </div>
      <div className='button-container'>
        <p>Click this button to insert a new row in Database</p>
        <button className='button' onClick={() => createName()}>insert!</button>
      </div>
    </div>
  )
}
ReactDOM.render(<App/>, document.getElementById('app'))
