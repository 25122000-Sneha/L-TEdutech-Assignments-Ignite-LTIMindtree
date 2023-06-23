import { Component } from '@angular/core';


import { People, people } from './people';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.scss' ]
})

export class AppComponent {
  
//Fill your code 
  peopleList: People[] = people;
 
}
