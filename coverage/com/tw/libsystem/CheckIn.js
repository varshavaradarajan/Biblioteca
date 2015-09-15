var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":1178,"methods":[{"el":13,"sc":5,"sl":10},{"el":20,"sc":5,"sl":15}],"name":"CheckIn","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_110":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_195":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_227":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_251":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_258":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_263":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_290":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_316":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_320":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_346":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_388":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_390":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_46":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_468":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_470":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_491":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_503":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_507":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_531":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_547":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_59":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_614":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_658":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_669":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_670":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_682":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_717":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_757":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_799":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_821":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [470, 388, 258, 717, 263, 799, 290, 251, 547, 491, 46, 195, 821, 320, 531, 757, 227, 59, 670, 503, 110, 658, 468, 390, 614, 316, 346, 682, 669, 507], [470, 388, 258, 717, 263, 799, 290, 251, 547, 491, 46, 195, 821, 320, 531, 757, 227, 59, 670, 503, 110, 658, 468, 390, 614, 316, 346, 682, 669, 507], [470, 388, 258, 717, 263, 799, 290, 251, 547, 491, 46, 195, 821, 320, 531, 757, 227, 59, 670, 503, 110, 658, 468, 390, 614, 316, 346, 682, 669, 507], [], [], [470, 388, 258, 717, 263, 799, 290, 547, 46, 195, 320, 531, 757, 227, 59, 503, 110, 658, 468, 614, 346, 682, 669, 507], [], [470, 388, 258, 717, 263, 799, 290, 547, 46, 195, 320, 531, 757, 227, 59, 503, 110, 658, 468, 614, 346, 682, 669, 507], [470, 388, 258, 717, 263, 799, 290, 547, 46, 195, 320, 531, 757, 227, 59, 503, 110, 658, 468, 614, 346, 682, 669, 507], [470, 388, 258, 717, 263, 799, 290, 547, 46, 195, 320, 531, 757, 227, 59, 503, 110, 658, 468, 614, 346, 682, 669, 507], [], []]
