import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
  styles:['h3{color:dodgerblue;}']
})
export class AppComponent {
  public colors=["red","blue","green","yellow"];
  public color="orange";
  displayName=false;
  numbers=[1,2,3,4,5];
  onlyOdd=false;
  public name="Harshitha";
  public message="";
}
