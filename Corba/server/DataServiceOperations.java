
/**
* DataServiceOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2020��5��10�� ������ ����01ʱ49��12�� CST
*/

public interface DataServiceOperations 
{
  void insert (String stuName, String StuNo, float score);
  float search (String stuNo);
} // interface DataServiceOperations
