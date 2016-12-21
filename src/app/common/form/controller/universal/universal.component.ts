import { Component, Input } from '@angular/core';
import { FormThingComponent } from '../../formthing.component';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Connection } from './../../../../service/connection';

@Component({
  selector: 'form-controller-universal',
  templateUrl: './universal.component.html',
})
export class FormControllerUniversalComponent extends FormThingComponent {

}
