import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './Component/home/home.component';
import { SearchComponent } from './Component/search/search.component';
import { CartComponent } from './Component/cart/cart.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'search', component:SearchComponent},
  {path:'',redirectTo: '/home',pathMatch:'full'},
  {path:'cart',component:CartComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
