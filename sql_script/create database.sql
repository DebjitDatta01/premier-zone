CREATE TABLE player_data (
    player_name VARCHAR(100),
    nation VARCHAR(50),
    position VARCHAR(10),
    age INTEGER,
    matches_played INTEGER,
    starts INTEGER,
    minutes_played FLOAT,
    goals FLOAT,
    assists FLOAT,
    penalties_scored FLOAT,
    yellow_cards FLOAT,
    red_cards FLOAT,
    expected_goals FLOAT,
    expected_assists FLOAT,
    team_name VARCHAR(100)
);


select * from player_data

COPY player_data FROM 'C:\Users\Debjit\Downloads\prem_stats.csv' DELIMITER ',' CSV HEADER; 
