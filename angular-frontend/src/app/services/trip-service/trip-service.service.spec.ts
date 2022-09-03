import { TestBed } from '@angular/core/testing';

import { TripServiceService } from './trip-service.service';

describe('TripServiceService', () => {
  let service: TripServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TripServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
