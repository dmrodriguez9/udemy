import { ButtonAddComponent } from "./button-add/button-add.component";
import { ButtonDisComponent } from "./button-dis/button-dis.component";
import { counterComponent } from "./counter.component";
import { TestBed, ComponentFixture} from "@angular/core/testing";

describe('counterComponent', ()=>{
 
    it('valor inicial del contador es 0', ()=>{
        const counter = new counterComponent()
        expect(counter.contador).toBe(0);

    });

    it('Se debe crear el componente counter', ()=>{
        const fixture = TestBed.createComponent(counterComponent);
        expect(fixture.componentInstance).toBeTruthy();
    })

    it('debe crear el texto counter: 0', ()=>{
        const fixture = TestBed.createComponent(counterComponent);
        fixture.detectChanges();
        const compiled : HTMLElement= fixture.nativeElement;
       expect(compiled.querySelector('h1')?.textContent).toContain('Contador: 0')
    });

});

describe('integrationTesting', ()=>{
    let component: counterComponent;
    let fixture: ComponentFixture<counterComponent>;
  
    beforeEach(async () => {
      await TestBed.configureTestingModule({
        declarations: [counterComponent, ButtonAddComponent, ButtonDisComponent]
      })
      .compileComponents();
      fixture = TestBed.createComponent(counterComponent);
      component = fixture.componentInstance;
      fixture.detectChanges();
    });


    it('evento clic add', ()=> {
        const compiled: HTMLElement = fixture.nativeElement;
        const counterValue = compiled.querySelector('h1')!;
        const btnAdd: HTMLElement = fixture.debugElement.nativeElement.querySelector("#add");
        btnAdd.click();
        fixture.detectChanges();
        expect(counterValue?.textContent).toContain("Contador: 1");
    });

    it('evento clic dis', ()=> {
        const compiled: HTMLElement = fixture.nativeElement;
        const counterValue = compiled.querySelector('h1')!;
        const btnAdd: HTMLElement = fixture.debugElement.nativeElement.querySelector("#dis");
        btnAdd.click();
        fixture.detectChanges();
        expect(counterValue?.textContent).toContain("Contador: -1");
    });
    
});