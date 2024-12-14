package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test   // the equilateral tests
  ///////////////////////////////////////////////////
	public void equilateralTriangle0(){
        int a = 5;
        int b = 5;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	public void equilateralTriangle1(){
        int a = 3;
        int b = 3;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	//// the scalene checks ////////////////////////////////////////
	
	@Test//this func checks a situation which the given lengthens
	// wont produce a triangle
	public void check_Scalene(){
        int a = 1;
        int b = 4;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
	public void check_Scalene1(){
        int a = 6;
        int b = 7;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
	
	/// the 3 isosceles checks//////////////////////////////////////
	public void check_isosceles(){
		int a = 7;
        int b = 5;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	public void check_isosceles1(){
		int a = 4;
        int b = 4;
        int c=6;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	public void check_isosceles2(){
		int a = 6;
        int b = 6;
        int c=7;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	/// check the invalid triangles
	
	public void check_invalidTriangle(){
		int a = 1;
        int b = 1;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	public void check_invalidTriangle1(){
		int a = 1;
        int b = 1;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	public void check_invalidTriangle2(){
		int a = 1;
        int b = 1;
        int c=8;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	public void check_invalidTriangle3(){
		int a = 0;
        int b = 0;
        int c=0;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	
	
}  