define(function(){
	return {
		rows: [
			{
				view: 'button',
				label: "Main",
				click: function() {
					routie('')
				}
			}
		],
		view: 'list',
		data: [
			'audi q7',
			'bmw x6',
			'vaz 2107'
		]
	}
})