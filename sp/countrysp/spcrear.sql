--insert records/delete
--select * items
--select * items


--para crear
/*create proc proc_getAllCountries
as
select * from tblCountries*/


create proc proc_getCountry
(
@CountryId int
)
as
select * from tblCountries where CountryId=@CountryId

