interface Bank{
  float rateOfInterest();
}

  class SBI implements Bank{
    public float rateOfInterest(){return 9.15f;}
  }
  class HDFC implements Bank{
    public float rateOfInterest(){return 9.7f;}
  }
