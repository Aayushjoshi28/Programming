from urllib.request import urlopen
from bs4 import BeautifulSoup
import ssl
import re

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter -')
html = urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, "html.parser")
sum = 0
# Retrieve all of the anchor tags
tags = soup('span')
for tag in tags:
    # Look at the parts of a tag
    y = str(tag)
    x = re.findall("[0-9]+",y)
    for i in x:
        i = int(i)
        sum = sum + i
print(sum)



    print(tag.get('href', None))



    import urllib.request, urllib.parse, urllib.error
    from bs4 import BeautifulSoup
    import ssl
    import re
    ctx = ssl.create_default_context()
    ctx.check_hostname = False
    ctx.verify_mode = ssl.CERT_NONE
    n=0

    url = 'http://py4e-data.dr-chuck.net/known_by_Bronwen.html'
    html = urllib.request.urlopen(url, context=ctx).read()
    soup = BeautifulSoup(html, 'html.parser')

    tags=  soup('a')
    def leave(link):

         html = urllib.request.urlopen(link, context=ctx).read()
         soup = BeautifulSoup(html, 'html.parser')
         tags=  soup('a')
         nope = tags[18]
         return(nope)
    while n!=7:
        if n==0:
            tag = tags[18]
        else:
            tag = nope
        link = str(tag)
        finding = re.findall('html">(.+)</',link)
        tag = tag.get('href',None)
        nope = leave(tag)
        n=n+1
    print (finding)
