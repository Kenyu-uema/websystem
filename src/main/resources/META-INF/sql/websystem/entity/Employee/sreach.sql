
select
	(select
		count(*)
	from
		m_game
	where
		game_title like /*GameTitle*/
	and
		hardware like /*Hardware*/)
	as search_count,
	m_game.game_id, game_title, hardware, impression, count(character_name) as character_count
from
	m_game
left join
	m_game_character
	on m_game.game_id = m_game_character.game_id
where
	game_title like /*GameTitle*/
and
	hardware like /*Hardware*/)
group by
	m_game.game_id, game_title, hardware, impression
order by
	m_game.game_id