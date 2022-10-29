$("h1").click(function()
{
    console.log("Se ha pulsado el titular h1");
})

$("li").click(function()
{
    console.log("Se ha pulsado sobre un elemento en la lista");
})

$("p").dblclick(function()
{
    console.log("Se ha pulsado sobre el parrafo");
})

$("input").eq(0).keypress(function()
{
    $(this).css("color","red"); // con el this se apunta al input
    console.log(event);
    if(event.which == 115)
    {
        $(this).css("color","yellow"); // con el this se apunta al input
    }
})

$("li").eq(0).click(function()
{
    $("#id1").fadeOut(2000);

})

/*$("li").eq(0).click(function()
{
    $("#id1").slideUp(2000);

})*/