import java.io.*;
class CricketPlayer
{
int pcode,run,notout;
String name;
int iplayed;
CricketPlayer(){ }

CricketPlayer(int pcode1,String pname,int run1,int iplayed1,int notout1)throws IOException
{
pcode=pcode1;
name=pname;
run=run1;
iplayed=iplayed1;
notout=notout1;
}

public double average (String name1)
{
double avg=0;
if(name.equals(name1))
{
avg=(double)run/(double)iplayed;
return avg;
}
else
return 0;
}

public double average ()
{
double avg=0;
avg+=(double)run/(double)iplayed;
return avg;
}
}