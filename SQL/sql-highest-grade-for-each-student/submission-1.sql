SELECT student_id, exam_id, score
FROM (
    SELECT
        student_id,
        exam_id,
        score,
        DENSE_RANK() OVER (
            PARTITION BY student_id
            ORDER BY score DESC, exam_id ASC
        ) AS rank_num
    FROM exam_results
) AS ranked_results
WHERE rank_num = 1
ORDER BY student_id;