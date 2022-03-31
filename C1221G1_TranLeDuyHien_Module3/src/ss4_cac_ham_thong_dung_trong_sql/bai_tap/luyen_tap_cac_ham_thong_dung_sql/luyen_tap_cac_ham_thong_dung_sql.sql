use quan_ly_sinh_vien_ss3;

select s.sub_id, s.sub_name, max(s.credit) as credit, s.`status`
from `subject` s;

select s.sub_id, s.sub_name, max(m.mark) as mark_max, s.`status`
from `subject` s inner join mark m on s.sub_id = m.sub_id;

select s.student_id, s.student_name, s.`status`,s.class_id, avg(m.mark) as mark
from student s inner join mark m on s.student_id = m.student_id
group by s.student_id
order by m.mark desc;