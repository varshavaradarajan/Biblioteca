var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":1178,"methods":[{"el":13,"sc":5,"sl":10},{"el":20,"sc":5,"sl":15}],"name":"CheckIn","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_119":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_210":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_216":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_250":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_276":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_283":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_289":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_299":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_304":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_319":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_339":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_347":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_352":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_379":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_425":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_427":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_49":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_511":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_514":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_537":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_550":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_555":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_581":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_599":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_63":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_672":{"methods":[{"sl":10},{"sl":15}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_718":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_730":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_731":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_747":{"methods":[{"sl":10},{"sl":15}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_783":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_825":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_872":{"methods":[{"sl":10},{"sl":15}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19}]},"test_896":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_975":{"methods":[{"sl":10}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [514, 304, 425, 283, 783, 289, 872, 319, 276, 599, 49, 210, 537, 299, 896, 216, 352, 581, 825, 339, 250, 63, 731, 975, 550, 119, 718, 511, 427, 672, 347, 379, 747, 730, 555], [514, 304, 425, 283, 783, 289, 872, 319, 276, 599, 49, 210, 537, 299, 896, 216, 352, 581, 825, 339, 250, 63, 731, 975, 550, 119, 718, 511, 427, 672, 347, 379, 747, 730, 555], [514, 304, 425, 283, 783, 289, 872, 319, 276, 599, 49, 210, 537, 299, 896, 216, 352, 581, 825, 339, 250, 63, 731, 975, 550, 119, 718, 511, 427, 672, 347, 379, 747, 730, 555], [], [], [514, 304, 425, 283, 783, 289, 872, 319, 599, 49, 210, 299, 216, 352, 581, 825, 339, 250, 63, 550, 119, 718, 511, 672, 379, 747, 730, 555], [], [514, 304, 425, 283, 783, 289, 872, 319, 599, 49, 210, 299, 216, 352, 581, 825, 339, 250, 63, 550, 119, 718, 511, 672, 379, 747, 730, 555], [514, 304, 425, 283, 783, 289, 872, 319, 599, 49, 210, 299, 216, 352, 581, 825, 339, 250, 63, 550, 119, 718, 511, 672, 379, 747, 730, 555], [514, 304, 425, 283, 783, 289, 872, 319, 599, 49, 210, 299, 216, 352, 581, 825, 339, 250, 63, 550, 119, 718, 511, 672, 379, 747, 730, 555], [], []]
