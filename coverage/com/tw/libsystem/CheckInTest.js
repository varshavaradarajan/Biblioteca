var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":1097,"methods":[{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21},{"el":34,"sc":5,"sl":27},{"el":43,"sc":5,"sl":36},{"el":54,"sc":5,"sl":45},{"el":67,"sc":5,"sl":56}],"name":"CheckInTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_110":{"methods":[{"sl":45}],"name":"shouldTakeBookNameAsInput","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":53}]},"test_217":{"methods":[{"sl":36}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":42}]},"test_289":{"methods":[{"sl":56}],"name":"shouldInformTheLibraryToAcceptTheBook","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":66}]},"test_359":{"methods":[{"sl":27}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [359], [], [359], [359], [359], [], [359], [], [], [217], [], [217], [217], [217], [], [217], [], [], [110], [], [110], [110], [110], [110], [110], [], [110], [], [], [289], [], [289], [289], [289], [289], [289], [289], [289], [], [289], [], [], []]
