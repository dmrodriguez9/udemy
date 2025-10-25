
create proc proc_AddEditCountry(

	@CountryId int=0,
	@CountryName varchar(100),
	@CreateBy varchar(50),
	@Delete bit=0

)
as
declare @Id int

if @Delete=1
begin
	delete from tblCountries where CountryId=@CountryId
end
else --if it is not deleting
begin
	if @CountryId=0
	begin
		--code for insert goes here
		insert into tblCountries(CountryName, CreatedBy, CreatedOn)
		select @CountryName, @CreateBy, GETDATE()
		select @Id=IDENT_CURRENT('tblCountries')
	end
	else
	begin
	  --code for edit goes here
	  update tblCountries set CountryName=@CountryName, ModifiedOn=GETDATE(), ModifiedBy=@CreateBy
	  where CountryId=@CountryId
	  select @Id=@CountryId
	end
end

select @Id Id
