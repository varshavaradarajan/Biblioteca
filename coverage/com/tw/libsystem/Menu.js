var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":80,"methods":[{"el":12,"sc":5,"sl":10},{"el":21,"sc":5,"sl":14}],"name":"Menu","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateTakingInputToInputView","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_134":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_136":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_164":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_187":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_204":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_205":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_211":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_222":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_226":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_233":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_243":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_249":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_265":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingOfMenuToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_268":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_315":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingOfMenuToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_34":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_389":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_404":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_416":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_44":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_445":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_453":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_465":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_523":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_539":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_545":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_56":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_564":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_578":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_640":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_645":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_658":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_690":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_70":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_733":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_734":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_761":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_771":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_78":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_789":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_798":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_799":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_811":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_831":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_839":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateTakingInputToInputView","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_861":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_876":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_902":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_903":{"methods":[{"sl":10}],"name":"shouldReturnNewMenus","pass":true,"statements":[{"sl":11}]},"test_920":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingOfMenuToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_929":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_937":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_941":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_946":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_95":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAListOfOptions","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]},"test_995":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [539, 920, 187, 78, 34, 645, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 831, 929, 761, 658, 564, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 226, 640, 937, 249, 125, 545, 268, 903, 389, 995, 839, 164, 861, 445, 811, 941, 70, 243, 946], [539, 920, 187, 78, 34, 645, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 831, 929, 761, 658, 564, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 226, 640, 937, 249, 125, 545, 268, 903, 389, 995, 839, 164, 861, 445, 811, 941, 70, 243, 946], [], [], [539, 920, 187, 78, 34, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 929, 761, 658, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 640, 937, 125, 545, 268, 389, 995, 839, 164, 861, 811, 941, 70, 243, 946], [], [539, 920, 187, 78, 34, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 929, 761, 658, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 640, 937, 125, 545, 268, 389, 995, 839, 164, 861, 811, 941, 70, 243, 946], [539, 920, 187, 78, 34, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 929, 761, 658, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 640, 937, 125, 545, 268, 389, 995, 839, 164, 861, 811, 941, 70, 243, 946], [539, 920, 187, 78, 34, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 929, 761, 658, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 640, 937, 125, 545, 268, 389, 995, 839, 164, 861, 811, 941, 70, 243, 946], [], [539, 920, 187, 78, 34, 95, 523, 136, 771, 44, 465, 315, 876, 789, 222, 211, 902, 578, 404, 929, 761, 658, 233, 453, 799, 265, 690, 416, 134, 733, 734, 798, 204, 205, 56, 640, 937, 125, 545, 268, 389, 995, 839, 164, 861, 811, 941, 70, 243, 946], [], []]
