module.export = {
    publicPath: process.env.NODE_ENV == 'production'
        ? '/profile-basic'
        : '/'
}