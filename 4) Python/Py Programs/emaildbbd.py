import sqlite3

conn = sqlite3.connect('emaildbbd.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS Counts')

cur.execute('''
CREATE TABLE Ages (
  name VARCHAR(128),
  age INTEGER
)''')

#    cur.execute('SELECT count FROM Counts WHERE org = ? ', (org,))
#    row = cur.fetchone()
#    if row is None:
#        cur.execute('''INSERT INTO Counts (org, count)
#                VALUES (?, 1)''', (org,))
#    else:
#        cur.execute('UPDATE Counts SET count = count + 1 WHERE org = ?',(org,))
#conn.commit()

# https://www.sqlite.org/lang_select.html
#sqlstr = 'SELECT org, count FROM Counts ORDER BY count DESC LIMIT 10'

#for row in cur.execute(sqlstr):
#    print(str(row[0]), row[1])

cur.close()
