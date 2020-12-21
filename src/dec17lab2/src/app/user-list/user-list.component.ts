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
      userId: '',
      id:'',
      title:'',
      body:''
    });
  }

  ngOnInit(): void {
    this.loadUser();
  }

  loadUser(){
    
    this.users = [];
    this.httpClient
    .get('https://jsonplaceholder.typicode.com/posts')
    .subscribe(result => {
      this.users = result as any[];
    });
  }

    addUser(){
      const newUser = this.form.value;
      this.httpClient
      .post('https://jsonplaceholder.typicode.com/posts',newUser)
      .subscribe(result => {
        this.form.reset();
        alert('Add User Success !');
        this.loadUser();
      });
    }
}
