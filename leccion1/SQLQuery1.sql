declare @i int, @count int
declare @name varchar (100)
declare @amount money


set @name = 'Danny'
set @i=1
set @count=10
set @amount=1000

--print @name

/*if @i=1
begin
	print 'Marcelo'
end
else
print 'Natasha'*/

while @i<=@count
begin
	print cast (@i as varchar(10)) + ' of ' + cast(@count as varchar(10))
	set @i= @i+1
end
