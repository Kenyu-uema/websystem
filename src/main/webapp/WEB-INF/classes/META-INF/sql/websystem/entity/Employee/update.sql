update
	m_game
set
	game_title = /*gameTitle*/'a', hardware = /*hardWare*/'a', 
	impression = /*impression*/'a', modify_date = to_date(sysdate,'yy-mm-dd'), 
	modify_user = 'TAFS', create_date = to_date(sysdate,'yy-mm-dd'), create_user = 'TAFS'
where
	game_id = /*gameId*/'22'