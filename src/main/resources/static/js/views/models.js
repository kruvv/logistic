define(['component/listPage', "collections/marksColl"], function(listPage, marksColl) {
	return listPage(
			'modelList', 
			'resource->/api/model', 
			[
				{ id:"name", editor:"text"},
				{ id:"mark", editor:"combo", options: marksColl}
			]
		)	
})