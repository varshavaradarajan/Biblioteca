var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":3253,"methods":[{"el":21,"sc":5,"sl":15},{"el":35,"sc":5,"sl":23},{"el":39,"sc":5,"sl":37},{"el":44,"sc":5,"sl":41}],"name":"CheckIn","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1195":{"methods":[{"sl":15},{"sl":23},{"sl":37}],"name":"shouldReturnACheckInMessageUponExecution","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":25},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":38}]},"test_1226":{"methods":[{"sl":15}],"name":"shouldReturnCheckInAsOperationOnParsingInputValue3","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_1878":{"methods":[{"sl":15}],"name":"shouldReturnNewCheckInObjects","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_2082":{"methods":[{"sl":15},{"sl":41}],"name":"shouldDelegateTheUserLoginToLoginOperation","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":42},{"sl":43}]},"test_876":{"methods":[{"sl":15},{"sl":23},{"sl":41}],"name":"shouldReturnLoginMessageInInvalidCredentialsAreEnteredWhileLoggingIn","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":25},{"sl":26},{"sl":28},{"sl":34},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1195, 2082, 1226, 1878, 876], [1195, 2082, 1226, 1878, 876], [1195, 2082, 1226, 1878, 876], [1195, 2082, 1226, 1878, 876], [1195, 2082, 1226, 1878, 876], [1195, 2082, 1226, 1878, 876], [], [], [1195, 876], [], [1195, 876], [876], [], [1195, 876], [1195], [1195], [1195], [1195], [], [876], [], [], [1195], [1195], [], [], [2082, 876], [2082, 876], [2082, 876], [], []]
