import { Component, EventEmitter, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `<h2>{{"Hello "+name}}</h2>
            <button (click)=fireEvent()>sendEvent</button>`,
  
  styles: []
})
export class TestComponent implements OnInit {
 @Input('parentData') public name:any;

 public childEvent=new EventEmitter();
 ngOnInit(){
  
}
fireEvent(){
  this.childEvent.emit("Hey codevaluation");
}
}

