//package quiz_week01_03.taeil;
//
//class Shape { 
//  int x, y; 
//  Shape() { 
//    this.x = 0; 
//    this.y = 0; 
// } 
// Shape(int x, int y) { 
//   this.x = x; 
//   this.y = y; 
//} 
////출력하기 
//void print() { 
//  System.out.printf("(x, y)의 값은 (%d, %d) 입니다.\n", this.x, this.y); 
//} 
//} 
//class Circle extends Shape { 
//  double r; //반지름 
//  Circle() { 
//    super(); 
//    this.r = 0; 
// } 
// Circle(int x, int y, double r) { 
//   super(x, y); 
//   this.r = r; 
//} 
////면적 구하기 
//double getArea() { 
//  return (this.r * this.r) * Math.PI; 
//} 
////출력하기 
//void print() { 
//  System.out.printf("(x, y)의 값은 (%d, %d) 이며, 반지름은 %.2f, 원의 넓이는 %.2f 입니다.\n", this.x, this.y, this.r, getArea()); 
//} 
//} 