-- Date Functions 

-- To Print today's date 

select curdate();

-- To Print today's time 

select curtime();

-- dayOfweek : Displays the weekday's no.

select dayofweek(curdate());

select dayofMonth(curdate());

select dayofyear(curdate());

select quarter(curdate());

select last_day(curdate());

select curdate();

select adddate(curdate(), INTERVAL 3 DAY);

select adddate(curdate(), INTERVAL 3 MONTH);

select adddate(curdate(), INTERVAL 3 YEAR);

select datediff('2021-06-11', curdate());

SELECT DATE_FORMAT(CURDATE(), '%M');

SELECT DATE_FORMAT(CURDATE(), '%m');

SELECT DATE_FORMAT(CURDATE(), '%W');

SELECT DATE_FORMAT(CURDATE(), '%w');




