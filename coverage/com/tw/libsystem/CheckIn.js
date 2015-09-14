var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":1178,"methods":[{"el":13,"sc":5,"sl":10},{"el":20,"sc":5,"sl":15}],"name":"CheckIn","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_110":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_217":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_289":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_359":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_43":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [359, 110, 289, 43, 217], [359, 110, 289, 43, 217], [359, 110, 289, 43, 217], [], [], [359, 110, 289, 217], [], [359, 110, 289, 217], [359, 110, 289, 217], [359, 110, 289, 217], [], []]
