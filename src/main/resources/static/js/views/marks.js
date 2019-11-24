define(['component/listPage'], function(listPage) {
	return listPage(
			'marList', 
			'resource->/api/mark', 
			[
				{ id:"name", editor:"text"}
			]
		)	
})