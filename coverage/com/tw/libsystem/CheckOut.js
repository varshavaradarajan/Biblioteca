var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":3277,"methods":[{"el":19,"sc":5,"sl":13},{"el":33,"sc":5,"sl":21},{"el":37,"sc":5,"sl":35},{"el":42,"sc":5,"sl":39}],"name":"CheckOut","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1433":{"methods":[{"sl":13},{"sl":21},{"sl":35}],"name":"shouldReturnAMessageUponExecution","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":23},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":36}]},"test_1880":{"methods":[{"sl":13},{"sl":21},{"sl":39}],"name":"shouldReturnLoginMessageInInvalidCredentialsAreEnteredWhileLoggingIn","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":23},{"sl":24},{"sl":26},{"sl":32},{"sl":40},{"sl":41}]},"test_2035":{"methods":[{"sl":13},{"sl":39}],"name":"shouldDelegateTheUserLoginToLoginOperation","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":40},{"sl":41}]},"test_2123":{"methods":[{"sl":13}],"name":"shouldReturnNewCheckOutObjects","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_827":{"methods":[{"sl":13}],"name":"shouldReturnCheckOutAsOperationOnParsingInputValue2","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1433, 1880, 2123, 2035, 827], [1433, 1880, 2123, 2035, 827], [1433, 1880, 2123, 2035, 827], [1433, 1880, 2123, 2035, 827], [1433, 1880, 2123, 2035, 827], [1433, 1880, 2123, 2035, 827], [], [], [1433, 1880], [], [1433, 1880], [1880], [], [1433, 1880], [1433], [1433], [1433], [1433], [], [1880], [], [], [1433], [1433], [], [], [1880, 2035], [1880, 2035], [1880, 2035], [], []]
