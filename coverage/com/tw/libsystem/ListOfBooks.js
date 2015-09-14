var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":32,"methods":[{"el":11,"sc":5,"sl":9},{"el":20,"sc":5,"sl":13},{"el":25,"sc":5,"sl":22}],"name":"ListOfBooks","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_119":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_129":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_207":{"methods":[{"sl":9},{"sl":13},{"sl":22}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":24}]},"test_290":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnBookDetailsWithColumnHeaders","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_296":{"methods":[{"sl":9},{"sl":13}],"name":"shouldReturnAPreExistingSetOfBooks","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]},"test_377":{"methods":[{"sl":9},{"sl":13},{"sl":22}],"name":"shouldReturnAllBookDetailsUponCallingExecuteMethod","pass":true,"statements":[{"sl":10},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":24}]},"test_421":{"methods":[{"sl":9}],"name":"shouldReturnAnOperationOnParsingTheInput","pass":true,"statements":[{"sl":10}]},"test_472":{"methods":[{"sl":9}],"name":"shouldReturnAnOperationOnParsingTheInput","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = $jsonSrcFileLines
