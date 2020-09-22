import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceCrudComponent } from './service-crud.component';

describe('ServiceCrudComponent', () => {
  let component: ServiceCrudComponent;
  let fixture: ComponentFixture<ServiceCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServiceCrudComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServiceCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
