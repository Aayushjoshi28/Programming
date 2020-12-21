import urllib.request, urllib.parse, urllib.error
import json
import xml.etree.ElementTree as ET


url = 'http://py4e-data.dr-chuck.net/comments_42.xml'
uh = urllib.request.urlopen(url,context = ctx)
data = uh.read()
tree = ET.fromstring(data)
search_str = "comments/comment"
counts_tags = tree.findall(search_str)

total = 0

for tags in counts_tags:
    c = tags.find('count')
    total = total + int(c.text)

print(total)
