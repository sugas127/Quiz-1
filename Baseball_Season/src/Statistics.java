public class Statistics {

private int Hits;
private int AB;
private int BB;
private int HBP;
private int SF;
private int dbl;
private int triple;
private int HR;
public Statistics(int hits, int aB, int bB, int hBP, int sF, int dbl, int triple, int hR) {
super();
// Variable and value assignments
Hits = hits;
AB = aB;
BB = bB;
HBP = hBP;
SF = sF;
this.dbl = dbl;
this.triple = triple;
HR = hR;
}
public int getHits() {
return Hits;
// Gives the value of hits after its been inputed by the user
}
public void setHits(int hits) {
Hits = hits;
}
public int getAB() {
return AB;
// gets the value of the at bats
}
public void setAB(int aB) {
AB = aB;
// sets the value of the at bats
}
public int getBB() {
return BB;
// returns the walks 
}
public void setBB(int bB) {
BB = bB;
// sets the value of the walks
}
public int getHBP() {
return HBP;
}
public void setHBP(int hBP) {
HBP = hBP;
}
public int getSF() {
return SF;
}
public void setSF(int sF) {
SF = sF;
}
public int getDbl() {
return dbl;
}
public void setDbl(int dbl) {
this.dbl = dbl;
}
public int getTriple() {
return triple;
}
public void setTriple(int triple) {
this.triple = triple;
}
public int getHR() {
return HR;
}
public void setHR(int hR) {
HR = hR;
}
public double SLG()
{
int singles = this.Hits - this.dbl - this.triple - this.HR;
double slg = (singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR)) / this.AB;
return slg;
}

public double OBP(){
int num = (Hits + BB + HBP );
int denum = (AB + BB + HBP + SF);
return num/denum;
}

public double OBS(){
return SLG() + OBP();
}
public int TB(){
return (Hits + (2*dbl) + (3*triple) + (4*HR));
}

public double BA(){
return TB()/AB;
}
}