update
	m_game
set
	game_title = /*gameTitle*/'%param.gameTitle%', hardware = /*hardWare*/'%param.hardWare%', 
	impression = /*Impression*/, modify_date = to_date(sysdate,'yy-mm-dd'), 
	modify_user = 'TAFS', create_date = to_date(sysdate,'yy-mm-dd'), create_user = 'TAFS'
where
	game_id = /*gameId*/'%param.gameId%'