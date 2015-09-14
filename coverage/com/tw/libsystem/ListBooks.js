var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":1423,"methods":[{"el":9,"sc":5,"sl":7},{"el":14,"sc":5,"sl":11}],"name":"ListBooks","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_137":{"methods":[{"sl":7},{"sl":11}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":8},{"sl":13}]},"test_287":{"methods":[{"sl":7}],"name":"shouldReturnAnOperationOnParsingTheInput","pass":true,"statements":[{"sl":8}]},"test_341":{"methods":[{"sl":7},{"sl":11}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":8},{"sl":13}]},"test_670":{"methods":[{"sl":7},{"sl":11}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":8},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [670, 137, 341, 287], [670, 137, 341, 287], [], [], [670, 137, 341], [], [670, 137, 341], [], []]
