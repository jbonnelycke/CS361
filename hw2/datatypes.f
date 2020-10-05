	program datatypes
	implicit none
		integer i
		real r
		double precision d
		complex x
		character (LEN=5) hi
		logical tf

		i = 3
		r = 4.0 / 3.0
		d = 4.0 / 3.0
		x = (2.0, -3.0)
		hi = 'hello'
		tf = .true.

		print*, i, ' ', r, ' ', d
		print*, x, ' ', hi, ' ', tf 
	end program datatypes
