import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {
  user : string;
  cust : Customer;
  name: string;
  customer:Observable<Customer>;
  constructor(private _customerService:CustomerService) { 
    //this.customer=this._customerService.customerEmailSearch(this.user);
    this.user = localStorage.getItem("user");
    this._customerService.customerEmailSearch(this.user).subscribe(x=>{
     this.cust=x;
    // alert(this.cust.cus_id);
      localStorage.setItem('customer', JSON.stringify(x));
      this.name=this.cust.cus_name;
    })
  }
  

  ngOnInit(): void {
  }

}