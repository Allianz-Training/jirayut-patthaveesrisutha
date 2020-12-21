import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-exchange-rate',
  templateUrl: './exchange-rate.component.html',
  styleUrls: ['./exchange-rate.component.css']
})
export class ExchangeRateComponent implements OnInit {

  form: FormGroup;
  targetAmount: number;
  constructor(private httpClient: HttpClient, private fb: FormBuilder) {
    this.form = this.fb.group({
      baseAmount: ['', Validators.required],
      baseCur: ['', Validators.required],
      targetCur: ['', Validators.required]

    });
  }
  ngOnInit(): void {
  }

  convert() {
    const base = this.form.get('baseCur').value.toUpperCase()
    const target= this.form.get('targetCur').value.toUpperCase();
    this.httpClient.get('https://api.exchangeratesapi.io/latest', { params: { base, target } }).subscribe( res =>
      this.targetAmount = this.form.get('baseAmount').value * res['rates'][target])
  }

}
