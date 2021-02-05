const path = require('path')
module.exports = {
  entry: './react/index.js',
  output: {
    filename: 'bundle.js',
    path: path.join(__dirname, 'public/javascripts')
  },
  module: {
    rules: [
      {
        loader: 'babel-loader',
        test: /\.js$/,
        exclude: /node_modules/
      },
      {
        test: /\.(jpg|png|svg)$/,
        use: {
          loader: 'url-loader',
          options: {
            mimetype: false,
          }
        }
      }
    ]
  },
  mode: 'development',
}
