import { NgModule } from "@angular/core";
import { counterComponent } from "./counter.component";

import { ButtonDisComponent } from "./button-dis/button-dis.component";
import { BrowserModule } from "@angular/platform-browser";
import { CommonModule } from "@angular/common";
import { ButtonAddComponent } from "./button-add/button-add.component";


@NgModule({
    declarations:[counterComponent, ButtonAddComponent, ButtonDisComponent],
    imports:[BrowserModule,CommonModule],
    exports:[counterComponent]

})
export class counterModule{}