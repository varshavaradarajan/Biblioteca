var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":847,"methods":[{"el":12,"sc":5,"sl":10},{"el":20,"sc":5,"sl":14}],"name":"CheckOut","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_130":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_176":{"methods":[{"sl":10},{"sl":14}],"name":"shouldDisplayAMessageAfterAnOperationIsExecute","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_401":{"methods":[{"sl":10},{"sl":14}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_453":{"methods":[{"sl":10}],"name":"shouldReturnCheckOutAsOperationOnParsingInputValue2","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [176, 130, 453, 401], [176, 130, 453, 401], [], [], [176, 130, 401], [], [176, 130, 401], [176, 130, 401], [176, 130, 401], [176, 130, 401], [], []]
