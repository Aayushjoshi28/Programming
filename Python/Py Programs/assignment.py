# @Author: Aayush Joshi SE4_14
# @Date:   2020-05-17T01:56:09+05:30
# @Email:  aayush.joshi_19@sakec.ac.in
# @Project: Programming
# @Filename: assignment.py
# @Last modified by:   Aayush Joshi SE4_14
# @Last modified time: 2020-09-10T11:36:43+05:30



import socket

mysock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
mysock.connect(('data.pr4e.org', 80))
cmd = 'GET http://data.pr4e.org/intro-short.txt HTTP/1.0\r\n\r\n'.encode()
mysock.send(cmd)

while True:
    data = mysock.recv(512)
    if len(data) < 1:
        break
    print(data.decode(),end='')

mysock.close()
