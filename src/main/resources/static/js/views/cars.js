define(['component/listPage', 'collections/modelsColl'], function(listPage, modelsColl) {
    return listPage(
    		'carList', 
			'resource->/api/car', 
			[
				{ id:"name", editor:"text"},
				{ id:"model", editor:"combo", options: modelsColl}
			]
    )
})