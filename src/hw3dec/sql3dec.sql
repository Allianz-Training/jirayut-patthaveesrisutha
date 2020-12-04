-- SELECT sname,age FROM Sailors

-- SELECT S.sname FROM Sailors S, Reserves R ON R.sid = S.sid WHERE R.bid = 103

-- SELECT DISTINCT S.sid FROM Sailors S, Reserves R, Boats B ON R.sid = S.sid AND B.bid = R.bid WHERE B.color = "Red" OR B.color = "red"

-- SELECT S.sname FROM Sailors S, Reserves R, Boats B ON R.sid = S.sid AND B.bid = R.bid WHERE B.color = "Red" OR B.color = "red"

-- SELECT B.color FROM Sailors S, Reserves R, Boats B ON R.sid = S.sid AND B.bid = R.bid WHERE S.sname = "Lubber"

SELECT DISTINCT sname FROM Reserves LEFT JOIN Sailors ON Reserves.sid = Sailors.sid 
