import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavBarComponent } from '../nav-bar/nav-bar.component';


const routes: Routes = [
  {
    path: 'nav',
    component: NavBarComponent
  }
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class RoutingModule { }
