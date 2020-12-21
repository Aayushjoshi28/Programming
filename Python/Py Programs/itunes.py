import sqlite3

conn = sqlite3.connect('itunes.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS Counts')

cur.close()
