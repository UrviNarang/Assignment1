class subtractorTest
{
	void test_sub()
	{
		subtractor s=new subtractor();
		assertEquals(s.sub(4,5),-1);
		assertEquals(s.sub(3,2),1);
	}
}
