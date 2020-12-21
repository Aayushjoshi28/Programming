text = "X-DSPAM-Confidence:    0.8475";
ipos = text.find(':')
print(ipos)
piece = text[ipos+1:]
print(piece)
