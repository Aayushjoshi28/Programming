import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

link = input("Enter URL:")
count = int(input("Enter count:"))
position = int(input("Enter position:"))

print("Retrieving:",link)
for i in range(0,count):
    html=urllib.request.urlopen(link).read()
    soup=BeautifulSoup(html,'html.parser')
    tags=soup('a')

    link=tags[position-1].get('href')

result=tags[position-1].get('href')
print(result)
