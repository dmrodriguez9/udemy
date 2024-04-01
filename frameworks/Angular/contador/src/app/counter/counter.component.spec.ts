import { counterComponent } from "./counter.component";

describe("counterComponent", ()=>{
    it("valor inicial del contador es 0", ()=>{
        const counter = new counterComponent()
        expect(counter.contador).toBe(0);

    })

});