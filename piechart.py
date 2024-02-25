import sys
from matplotlib.animation import FuncAnimation
#matplotlib.use('Agg')

import matplotlib.pyplot as plt
import numpy as np

y = np.array([35, 25, 25, 15,44])
mylabels = ["Apples", "Bananas", "Cherries", "Dates","strawberries"]
myexplode = [0.2, 0, 0, 0, 0]

plt.pie(y, labels = mylabels,explode=myexplode ,startangle = 0,shadow=True,rotatelabels=True,radius=1,frame=True)
plt.title('Fruits pie chart')
plt.legend(title = "Fruits")
plt.savefig('pie_chart_png',dpi=300,bbox_inches='tight')

plt.show() 

#Two  lines to make our compiler able to draw:
#plt.savefig(sys.stdout.buffer)
#sys.stdout.flush()
