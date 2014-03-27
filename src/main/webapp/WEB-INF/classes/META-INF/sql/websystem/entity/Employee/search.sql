select
	game_id, game_title, hardware, impression
from
	m_game
where
	game_title like  '%'||/*gameTitle*/'a' || '%' ESCAPE '$'
or
	hardware like '%'||/*hardWare*/'a' || '%' ESCAPE '$'
order by
	game_id