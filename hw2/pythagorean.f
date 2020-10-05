	program pythagorean
	implicit none
		integer input1, input2
		real output
		real :: pyth

		input1 = 3
		input2 = 4

		output = pyth(input1, input2)
		print*, output
	end program
	
	real function pyth(a, b)
	implicit none
		integer a, b
		real a2, b2, c2, c
		
		a2 = a * a
		b2 = b * b

		c2 = a2 + b2
		c = sqrt(c2)
		return
	end function
