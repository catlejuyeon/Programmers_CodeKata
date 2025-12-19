SELECT  a.author_id, a.author_name,b.category, SUM(bs.sales * b.price) AS total_sales
FROM book_sales bs
JOIN book b USING (book_id)
JOIN author a USING (author_id)
WHERE bs.sales_date >= '2022-01-01' AND bs.sales_date < '2022-02-01'
GROUP BY a.author_id, a.author_name, b.category
ORDER BY a.author_id ASC, b.category DESC;