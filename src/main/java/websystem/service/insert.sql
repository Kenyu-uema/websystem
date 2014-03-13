insert into
	m_game
	(game_id,game_title,hardware,impression,modify_date,modify_user,create_date,create_user)
select
	max(game_id) + 1, /*gameTitle*/'%param.gameTitle%', /*hardWare*/'%param.hardWare%' , /*impression*/'%param.impression%', to_date(sysdate,'yy-mm-dd'),'TAFS',to_date(sysdate,'yy-mm-dd'),'TAFS'
from 
	m_game