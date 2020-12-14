import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Hw3TopBannerComponent } from './hw3-top-banner.component';

describe('Hw3TopBannerComponent', () => {
  let component: Hw3TopBannerComponent;
  let fixture: ComponentFixture<Hw3TopBannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Hw3TopBannerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Hw3TopBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
