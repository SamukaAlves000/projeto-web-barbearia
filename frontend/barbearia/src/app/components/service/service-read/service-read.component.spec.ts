import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceReadComponent } from './service-read.component';

describe('ServiceReadComponent', () => {
  let component: ServiceReadComponent;
  let fixture: ComponentFixture<ServiceReadComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServiceReadComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServiceReadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
