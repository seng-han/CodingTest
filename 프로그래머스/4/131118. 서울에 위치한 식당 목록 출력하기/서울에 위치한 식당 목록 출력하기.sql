-- 코드를 입력하세요
SELECT ri.rest_id, 
ri.rest_name,
ri.food_type,
ri.favorites,
ri.address,
ROUND(AVG(RR.REVIEW_SCORE), 2) AS SCORE
from rest_info ri left join rest_review rr
on ri.rest_id = rr.rest_id
where ri.address like '서울%'
group by ri.rest_id, ri.rest_name, ri.food_type, ri.favorites, ri.address
having count(rr.review_id) > 0
order by score desc, ri.favorites desc;