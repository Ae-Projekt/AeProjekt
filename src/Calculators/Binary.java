package Calculators;

public class Binary
{
	private int _decimal = 0;
	private String _binary = "";
	
	public Binary(int decimal)
	{
		decimalToBinary(decimal);
		System.out.println(_binary);
	}
	public Binary(String binary)
	{
		
	}
	
	private void decimalToBinary(int decimal)
	{
		if(decimal % 2 == 0)
		{
			_binary = _binary + "0";
		}
		else
		{
			_binary = _binary + "1";
		}
		
		if(_decimal > 1)
		{
			decimalToBinary(decimal / 2);
		}
	}
	
	private void binaryToDecimal(String binary)
	{
		
		_decimal = 0;
	}
}
