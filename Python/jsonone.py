import urllib.request, urllib.parse, urllib.error
import json

url = input("Enter Url")
uh = urllib.request.urlopen(url)
data = uh.read()
datax = json.loads(data)

total = 0

for tags in datax['comments']:
    total = total + tags["count"]

print(total)
