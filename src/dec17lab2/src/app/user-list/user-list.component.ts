import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users: any[];
  form:  FormGroup;
  
  constructor(private httpClient: HttpClient, private fb: FormBuilder) { 
    this.form = this.fb.group({
      name: '',
      email:''
    });
  }

  ngOnInit(): void {
    this.httpClient
    .get('https://jsonplaceholder.typicode.com/posts')
    .subscribe(result => {
      this.users = result as any[];
    });
  }

}
