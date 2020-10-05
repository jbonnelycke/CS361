	program main
	implicit none
		external swap
		integer :: a, b

		a = 1
		b = 2

		call swap(a, b)
		print*, a, " ", b
	end program

	subroutine swap(a, b)
		integer :: a, b, temp
		
		temp = a
		a = b
		b = temp
		
	end subroutine
