-- Write your query below
select users.name, coalesce(sum(rides.distance),0) as travelled_distance from users left join rides on users.id = rides.user_id
group by users.name
order by travelled_distance desc, users.name asc;