import { Component } from "@angular/core";
import { reduce } from "rxjs";

@Component({
    selector: 'app-warning-alert',
    template: `
     <p>This is a warning, you are in danger!!</p>
    ` ,
    styles:[
         `  p{
            padding: 20px;
            background-color:mistyrose;
            border:1px solid reduce;
        } `
     ]
    
})
export class WarningAlertComponent{

}