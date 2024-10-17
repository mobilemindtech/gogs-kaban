import {resolve} from 'path'
import {defineConfig, Plugin, loadEnv} from 'vite'
import {createHtmlPlugin} from 'vite-plugin-html'
const scalaVersion = '3.5.1'
const mainName = `app-fastopt/main.js`

const mainJS = `./target/scala-${scalaVersion}/${mainName}`
const script = `<script type="module" src="${mainJS}"></script>`

export default defineConfig({
	resolve: {
		alias: {
			'stylesheets': resolve(__dirname, './src/main/static/stylesheets'),
		}
	},
	build: {
		watch: {
			include: [resolve(__dirname, './src/main/static/stylesheets/**')],
			usePolling: true,
		},
	},
	server: {
		port: 3000
	},
	plugins: [
		createHtmlPlugin({
			minify: true,
			/**
			 * After writing entry here, you will not need to add script tags in `index.html`, the original tags need to be deleted
			 * @default src/main.ts
			 */
			//entry: 'src/main.ts',
			/**
			 * If you want to store `index.html` in the specified folder, you can modify it, otherwise no configuration is required
			 * @default index.html
			 */
			//template: './src/main/static/public/index.html',
			/**
			 * Data that needs to be injected into the index.html ejs template
			 */
			inject: {
				data: {
					script: script,
				},
			},
		})
	]
})

/*
export default ({mode}) => {

	return {
		publicDir: './src/main/static/public',
		plugins: [
			...(process.env.NODE_ENV === 'production' ? [minifyHtml(),] : []),
			injectHtml({
				injectData: {
					script
				}
			})
		],
		resolve: {
			alias: {
				'stylesheets': resolve(__dirname, './src/main/static/stylesheets'),
			}
		}
	}
}*/