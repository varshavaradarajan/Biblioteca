var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":32,"methods":[{"el":11,"sc":5,"sl":9},{"el":20,"sc":5,"sl":13},{"el":25,"sc":5,"sl":22}],"name":"ListOfBooks","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_117":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_189":{"methods":[{"sl":9},{"sl":13},{"sl":22}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":24}]},"test_265":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_271":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_346":{"methods":[{"sl":9},{"sl":13},{"sl":22}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":24}]},"test_385":{"methods":[{"sl":9}],"name":"shouldReturnAnOperationOnParsingTheInput","pass":true,"statements":[{"sl":10}]},"test_433":{"methods":[{"sl":9}],"name":"shouldReturnAnOperationOnParsingTheInput","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = $jsonSrcFileLines
