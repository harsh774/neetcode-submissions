-- Write your query below

select student_id, exam_id, score 
from
    (select student_id, exam_id, score, dense_rank() over(partition by student_id order by score desc, exam_id) as dr from exam_results) dr

    where dr.dr = 1
    order by student_id
