import { Component, OnInit } from '@angular/core';
import {TripService} from "../../services/trip-service/trip.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-trip-form',
  templateUrl: './trip-form.component.html',
  styleUrls: ['./trip-form.component.css']
})
export class TripFormComponent implements OnInit {

  tripForm = new FormGroup({
    tripStartDate: new FormControl('')
  })

  submitData() {
    console.log("sending data")
    console.log(JSON.stringify(this.tripService))
  }

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
  }

}
