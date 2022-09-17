class PrefferedTransportations{
  def transportationFactors(congestedTraffic,enoughSpace,produceEmissions,highDistance):
    if congestedTraffic == true:
      println("User should either take a plane, train, subway, or rely on walking or biking to reach their destination.")
    if congestedTraffic == false:
      println("User should take an automobile as a source of private transportation to get to their destination.")
    if enoughSpace == true:
      println("User should take an automobile to get to their destination the fastest.")
    if enoughSpace == false:
      println("User should rely on an airplane given circumstances or use a train, subway, or self transporation to get to their destination.")
    if produceEmissions == true:
      println("User should only rely on using human transportation such as walking or biking to prevent emissions.")
    if produceEmissions == false:
      println("Since emissions is not cared about, use a plane, automobile, train, or subway to get to your destination.")
    if highDistance == true:
      println("User should rely on an automobile, airplane, train, or subway to get to their destination since getting their is transportation reliant.")
    if highDistance == false:
      println("User should rely on human transportation either a bicycle or walking to get to their destination.")
    end if
    else: println("User should evalaute their desination and choose the most cost effective form of transportation to arrive there.")
}