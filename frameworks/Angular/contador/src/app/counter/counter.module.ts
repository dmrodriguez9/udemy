import { NgModule } from "@angular/core";
import { counterComponent } from "./counter.component";
import { ButtonAddComponent } from "./button-add/button-add.component";
import { ButtonDisComponent } from "./button-dis/button-dis.component";
import { BrowserModule } from "@angular/platform-browser";
import { CommonModule } from "@angular/common";


@NgModule({
    declarations:[counterComponent, ButtonAddComponent, ButtonDisComponent],
    imports:[CommonModule],
    exports:[counterComponent]

})
export class counterModule{

}