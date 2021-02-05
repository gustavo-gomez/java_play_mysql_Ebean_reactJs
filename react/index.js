import React from 'react';
import ReactDOM from 'react-dom';
import pagConst from './images/const1.png'

class App extends React.Component {
  render() {
    return (
      <div className="page_container">
        <img src={pagConst} className="image_const"/>
      </div>
    )
  }
}

ReactDOM.render(<App />, document.getElementById('app'));
