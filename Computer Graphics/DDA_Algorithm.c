/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-12T12:50:10+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: DDA_Algorithm.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-12T19:06:24+05:30
 */
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<math.h>
#include<dos.h>
#include<graphics.h>

void dda(int x1,int y1,int x2,int y2);

void main()
{
  int gd = DETECT,gm; //for detecting the graphics drivers automatically

  int x1,y1,x2,y2; //variables for storing starting and end points
  initgraph(&gd,&gm,"C:\\TURBOC3\\BGI"); //Initialize to graphics mode
  cleardevice();
  printf("\n\t------------------DDA Line Generation Algorithm-------------------");
  printf("\n\tEnter the starting co-ordinates for drawing line:\n\t");
  scanf("%d",&x1);
  scanf("%d",&y1);
  printf("\n\tEnter the ending co-ordinates for drawing line:\n\t");
  scanf("%d",&x2);
  scanf("%d",&y2);
  dda(x1,y1,x2,y2);
  printf("\n\tThank You");
  getch();
  closegraph();
}

void dda(int x1,int y1,int x2,int y2)
{
  int i,dx,dy,steps;
  float x,y;
  float xinc,yinc;
  dx = (float) x2-x1;
  dy = (float) y2-y1;

  if(abs(dx)>=abs(dy))
  {
    steps = dx; //movement towards the x-direction
  }
  else
  {
    steps = dy; //movement towards the y-direction
  }
  //increment values of x and y
  xinc = (float) dx/steps;
  yinc = (float) dy/steps;

  x = x1;
  y = y1;
  //for plotting of the first point
  putpixel(x,y,WHITE);

  //for plotting rest of the points
  for(i=1;i<steps;i++)
  {
    x = x + xinc;
    y = y + yinc;
    ceil(x);
    ceil(y);
    putpixel(x,y,WHITE);
  }
}
