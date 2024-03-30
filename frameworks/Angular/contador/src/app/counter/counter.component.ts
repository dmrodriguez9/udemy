import { Component } from "@angular/core";

@Component({
    selector: 'app-contador',
    templateUrl: './counter.component.html',
})


export class counterComponent{
    contador: number=0;

  aumentar(){
    this.contador++;
  }
  disminuir(){
    this.contador--;
  }

}